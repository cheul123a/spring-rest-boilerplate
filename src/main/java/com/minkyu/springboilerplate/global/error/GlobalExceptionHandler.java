package com.minkyu.springboilerplate.global.error;

import com.minkyu.springboilerplate.global.common.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by MinKyu Kim
 * Created on 2022-02-17.
 **/

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponse> handleBusinessException(BusinessException e) {
        return ResponseEntity.badRequest().body(
                new ErrorResponse(e.getErrorCode())
        );
    }

}
