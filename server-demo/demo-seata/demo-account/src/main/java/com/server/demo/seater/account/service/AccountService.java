package com.server.demo.seater.account.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.server.demo.seater.account.entity.Account;
import org.springframework.stereotype.Service;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/21
 */
@Service
public interface AccountService extends IService<Account> {

    void decrease(Long userId, Integer money);
}