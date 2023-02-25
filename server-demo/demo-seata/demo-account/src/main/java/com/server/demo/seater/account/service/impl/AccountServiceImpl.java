package com.server.demo.seater.account.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.demo.seater.account.dao.AccountMapper;
import com.server.demo.seater.account.entity.Account;
import com.server.demo.seater.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/21
 */
@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {
    @Override
    public void decrease(Long userId, Integer money) {
        Account storage = lambdaQuery().eq(Account::getUserId, userId).one();

        lambdaUpdate().set(Account::getUsed, storage.getUsed() + money)
                .set(Account::getResidue, storage.getResidue() - money)
                .eq(Account::getUserId, userId)
                .update(new Account());
    }
}
