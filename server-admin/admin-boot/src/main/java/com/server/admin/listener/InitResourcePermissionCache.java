package com.server.admin.listener;

import com.server.admin.service.ISysPermissionService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/13
 */
@Component
@AllArgsConstructor
public class InitResourcePermissionCache implements CommandLineRunner {

    private ISysPermissionService iSysPermissionService;

    @Override
    public void run(String... args) {
        iSysPermissionService.refreshPermRolesRules();
    }
}
