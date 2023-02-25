package com.server.auth.comm.enums;

import lombok.Getter;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/12
 */
public enum PasswordEncoderTypeEnum {
    BCRYPT("{bcrypt}","BCRYPT加密"),
    NOOP("{noop}","无加密明文");

    @Getter
    private String prefix;

    PasswordEncoderTypeEnum(String prefix,String desc){
        this.prefix=prefix;
    }
}
