package com.server.demo.seater.storage.controller;

import com.server.common.base.result.R;
import com.server.demo.seater.storage.service.StorageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/21
 */
@RestController
@RequestMapping("/storage")
@RequiredArgsConstructor
@Slf4j
public class StorageController {
    private final StorageService storageService;

    @RequestMapping("/decrease")
    public R decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        log.info("storage服务开始扣减库存");
        storageService.decrease(productId, count);
        return R.ok("库存扣减成功");
    }
}

