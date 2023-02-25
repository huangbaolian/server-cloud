package com.server.common.base.constant;

public interface SecurityConstants {

    /**
     * 认证请求头key
     */
    String AUTHORIZATION_KEY="authorization";
    /**
     * JWT令牌前缀
     */
    String JWT_PREFIX="Bearer";
    /**
     * Basic认真前缀
     */
    String BASIC_PREFIX="Basic";
    /**
     * JWT载体key
     */
    String JWT_PAYLOAD_KEY="payload";
    /**
     * JWT ID唯一标识
     */
    String JWT_JTI="jti";
    /**
     * JWT ID唯一标识
     */
    String JWT_EXP="exp";
    /**
     * JWT存储权限前缀
     */
    String AUTHORITY_PREFIX="ROLE_";
    /**
     * JWT存储权限属性
     */
    String JWT_AUTHORITIES_KEY="authorities";

    String APP_API_PATTERN="/*/app-api/**";
    /**
     * 黑名单token前缀
     */
    String TOKEN_BLACKLIST_PREFIX="auth:token:blacklist";

}
