package com.server.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.server.admin.dto.UserAuthDTO;
import com.server.admin.entity.SysUser;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/13
 */
public interface ISysUserService extends IService<SysUser> {


    /**
     * 根据用户名获取认证用户信息，携带角色和密码
     *
     * @param username
     * @return
     */
    UserAuthDTO getByUsername(String username);
}
