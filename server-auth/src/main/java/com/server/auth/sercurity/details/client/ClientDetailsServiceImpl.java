package com.server.auth.sercurity.details.client;

import com.server.admin.api.OAuthClientFeignClient;
import com.server.admin.dto.OAuth2ClientDTO;
import com.server.auth.comm.enums.PasswordEncoderTypeEnum;
import com.server.common.base.result.R;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/12
 */
@Service
@RequiredArgsConstructor
public class ClientDetailsServiceImpl implements ClientDetailsService {

    private final OAuthClientFeignClient oAuthClientFeignClient;

    @Override
    //@Cacheable(cacheNames = "auth", key = "'oauth-client:'+#clientId")
    public ClientDetails loadClientByClientId(String clientId) {
        // 通过feign 调用admin服务获取client信息
        R<OAuth2ClientDTO> result = oAuthClientFeignClient.getOAuth2ClientById(clientId);
        if (R.ok().getCode().equals(result.getCode())) {
            OAuth2ClientDTO client = result.getData();
            BaseClientDetails clientDetails = new BaseClientDetails(
                    client.getClientId(),
                    client.getResourceIds(),
                    client.getScope(),
                    client.getAuthorizedGrantTypes(),
                    client.getAuthorities(),
                    client.getWebServerRedirectUri());
            clientDetails.setClientSecret(PasswordEncoderTypeEnum.NOOP.getPrefix() + client.getClientSecret());
            clientDetails.setAccessTokenValiditySeconds(client.getAccessTokenValidity());
            clientDetails.setRefreshTokenValiditySeconds(client.getRefreshTokenValidity());
            return clientDetails;
        } else {
            throw new NoSuchClientException(result.getMsg());
        }
    }
}
