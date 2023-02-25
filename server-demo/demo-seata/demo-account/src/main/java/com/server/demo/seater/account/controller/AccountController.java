package com.server.demo.seater.account.controller;

import com.server.common.base.result.R;
import com.server.demo.seater.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/20
 */
@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
@Slf4j
public class AccountController {
    private final AccountService accountService;

    @RequestMapping("/decrease")
    public R decrease(@RequestParam("userId") Long userId, @RequestParam("money") Integer money) {
        log.info("Account 服务开始扣减余额");
        accountService.decrease(userId, money);
        return R.ok("余额扣减成功");
    }
}
