package com.server.demo.seater.order.controller;

import com.server.common.base.result.R;
import com.server.demo.seater.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/21
 */
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final OrderService orderService;

    @RequestMapping("/createOrder")
    public R createOrder() {
        log.info("Oder服务开始创建订单");
        orderService.createOrder();
        return R.ok("订单创建成功");
    }
}