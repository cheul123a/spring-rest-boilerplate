package com.minkyu.springboilerplate.global.error.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by MinKyu Kim
 * Created on 2022-02-17.
 **/

@Getter
@RequiredArgsConstructor
public enum SecurityErrorCode implements ErrorCode {
    UNAUTHORIZED("1000", "Unauthorized");


    private final String errorCode;
    private final String errorMessage;
}
