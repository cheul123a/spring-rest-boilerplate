package com.minkyu.springboilerplate.global.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by MinKyu Kim
 * Created on 2021-11-15.
 **/
@Getter
@NoArgsConstructor
public class SuccessResponse<T> {
    private String resultCode = "0000";
    private T data;

    public SuccessResponse(T data) {
        this.data = data;
    }

}
