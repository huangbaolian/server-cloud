package com.server.admin.controller;

import com.server.common.base.result.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/16
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping()
    public R test(){
        return R.ok("successs");
    }
}
