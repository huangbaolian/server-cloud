package com.server.common.web.exception;

import com.server.common.base.result.IResultCode;

public class BizException extends RuntimeException {

    public IResultCode resultCode;

    public BizException(IResultCode resultCode) {
        super(resultCode.getMsg());
        this.resultCode = resultCode;
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Throwable cause) {
        super(cause);
    }
}
