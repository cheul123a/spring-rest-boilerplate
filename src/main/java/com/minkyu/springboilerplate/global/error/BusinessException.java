package com.minkyu.springboilerplate.global.error;

import com.minkyu.springboilerplate.global.error.code.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * Created by MinKyu Kim
 * Created on 2022-02-17.
 * Business 관련 Exception은 모두 이 Exception클래스를 상속 받는다.
 **/
@Getter
@RequiredArgsConstructor
public class BusinessException extends RuntimeException {

    private final ErrorCode errorCode;


}
