package com.minkyu.springboilerplate.global.common;

import com.minkyu.springboilerplate.global.error.code.ErrorCode;
import lombok.Getter;

/**
 * Created by MinKyu Kim
 * Created on 2021-11-15.
 **/

@Getter
public class ErrorResponse {
    private String resultCode;
    private String message;

    public ErrorResponse(ErrorCode errorCode) {
        this.resultCode = errorCode.getErrorCode();
        this.message = errorCode.getErrorMessage();
    }

}
