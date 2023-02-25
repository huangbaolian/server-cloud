package com.server.demo.seater.account.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.server.demo.seater.account.entity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/21
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
