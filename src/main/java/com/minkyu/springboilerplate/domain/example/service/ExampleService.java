package com.minkyu.springboilerplate.domain.example.service;

import com.minkyu.springboilerplate.global.common.SuccessResponse;
import org.springframework.stereotype.Service;

/**
 * Created by MinKyu Kim
 * Created on 2022-02-17.
 **/

@Service
public class ExampleService {

    public SuccessResponse<String> greetings() {
        return new SuccessResponse<>("greetings");
    }
}
