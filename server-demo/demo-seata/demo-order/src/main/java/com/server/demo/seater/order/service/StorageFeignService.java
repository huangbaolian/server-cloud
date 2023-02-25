package com.server.demo.seater.order.service;

import com.server.common.base.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/21
 */
@FeignClient(value = "server-demo-storage")
@RequestMapping("/storage")
public interface StorageFeignService {
    @RequestMapping("/decrease")
    public R decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}