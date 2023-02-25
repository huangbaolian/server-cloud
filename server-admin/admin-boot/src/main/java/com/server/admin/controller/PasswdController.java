package com.server.admin.controller;

import com.server.common.base.result.R;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/14
 */
@RestController
@RequestMapping("/passwd")
@RequiredArgsConstructor
public class PasswdController {

    @RequestMapping("/genPasswd/{passwd}")
    public R<String> genPasswd(@PathVariable("passwd") String passwd){
        PasswordEncoder passwordEncoder =  new BCryptPasswordEncoder();
        return R.ok(passwordEncoder.encode(passwd));
    }

}