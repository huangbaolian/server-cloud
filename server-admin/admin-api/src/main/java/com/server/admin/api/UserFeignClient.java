package com.server.admin.api;

import com.server.admin.dto.UserAuthDTO;
import com.server.common.base.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/13
 */
@FeignClient(value = "server-admin")
public interface UserFeignClient {
    @GetMapping("/api/v1/users/username/{username}")
    R<UserAuthDTO> getUserByUsername(@PathVariable String username);
}
