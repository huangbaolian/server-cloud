package com.server.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.admin.dto.UserAuthDTO;
import com.server.admin.entity.SysUser;
import com.server.admin.mapper.SysUserMapper;
import com.server.admin.service.ISysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/13
 */
@Service
@RequiredArgsConstructor
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    @Override
    public UserAuthDTO getByUsername(String username) {
        UserAuthDTO userAuthInfo = this.baseMapper.getByUsername(username);
        return userAuthInfo;
    }
}
