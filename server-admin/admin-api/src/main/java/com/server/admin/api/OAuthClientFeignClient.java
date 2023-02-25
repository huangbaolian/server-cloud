package com.server.admin.api;

import com.server.admin.dto.OAuth2ClientDTO;
import com.server.common.base.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/13
 */
@FeignClient(value = "server-admin", contextId = "oauth-client")
public interface OAuthClientFeignClient {
    @GetMapping("/api/oauth-clients/getOAuth2ClientById")
    R<OAuth2ClientDTO> getOAuth2ClientById(@RequestParam String clientId);
}
