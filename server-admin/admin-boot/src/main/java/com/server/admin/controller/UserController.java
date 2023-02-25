package com.server.admin.controller;

import com.server.admin.dto.UserAuthDTO;
import com.server.admin.service.ISysUserService;
import com.server.common.base.result.R;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/14
 */
@RestController
@RequestMapping("/api/v1/users")
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final ISysUserService iSysUserService;

    //private final IMemberUserService memberUserService;

    /**
     * 获取用户信息
     */
    @GetMapping("/username/{username}")
    public R<UserAuthDTO> getUserByUsername(@PathVariable String username) {
        UserAuthDTO user = iSysUserService.getByUsername(username);
        return R.ok(user);
    }
   /**
     * 获取会员用户信息
     */
    /*@GetMapping("/member/username/{username}")
    public R<MemberUserAuthDTO> getMemberUserByUsername(@PathVariable String username) {
        log.info("获取member user info。。。");
        MemberUserAuthDTO user = memberUserService.getByUsername(username);
        return R.ok(user);
    }*/
}