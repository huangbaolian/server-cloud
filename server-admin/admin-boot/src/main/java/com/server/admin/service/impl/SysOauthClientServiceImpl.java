package com.server.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.admin.entity.SysOauthClient;
import com.server.admin.mapper.SysOauthClientMapper;
import com.server.admin.service.ISysOauthClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/13
 */
@Service
@RequiredArgsConstructor
public class SysOauthClientServiceImpl extends ServiceImpl<SysOauthClientMapper, SysOauthClient> implements ISysOauthClientService {

}
