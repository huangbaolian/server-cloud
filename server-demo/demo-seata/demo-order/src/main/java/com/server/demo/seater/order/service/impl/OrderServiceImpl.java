package com.server.demo.seater.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.common.base.result.R;
import com.server.demo.seater.order.dao.OrderMapper;
import com.server.demo.seater.order.entity.Order;
import com.server.demo.seater.order.service.AccountFeignService;
import com.server.demo.seater.order.service.OrderService;
import com.server.demo.seater.order.service.StorageFeignService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/21
 */
@Service
@RequiredArgsConstructor
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    private final AccountFeignService accountFeignService;
    private final StorageFeignService storageFeignService;

    @Override
    @GlobalTransactional(name = "ams-create-order",rollbackFor = Exception.class)
    public R createOrder() {
        Order order = Order.builder()
                .count(10)
                .money(100)
                .productId(1L)
                .status(0)
                .userId(1L)
                .build();
        // 创建订单
        save(order);
        // 扣除库存
        storageFeignService.decrease(order.getProductId(), order.getCount());
        // 扣余额
        accountFeignService.decrease(order.getUserId(), order.getMoney());
        //更新订单状态
        order.setStatus(1);
        updateById(order);
        return R.ok();
    }
}