package com.server.admin.dto;

import lombok.Data;

import java.util.List;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/13
 */
@Data
public class UserAuthDTO {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户状态：1-有效；0-禁用
     */
    private Integer status;

    /**
     * 用户角色编码集合 ["ROOT","ADMIN"]
     */

    private List<String> roles;


}
