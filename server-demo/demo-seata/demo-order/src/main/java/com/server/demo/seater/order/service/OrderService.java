package com.server.demo.seater.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.server.common.base.result.R;
import com.server.demo.seater.order.entity.Order;
import org.springframework.stereotype.Service;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/21
 */
@Service
public interface OrderService extends IService<Order> {

    R createOrder();

}