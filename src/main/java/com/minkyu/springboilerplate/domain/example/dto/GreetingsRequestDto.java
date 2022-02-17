package com.minkyu.springboilerplate.domain.example.dto;

import javax.validation.constraints.NotEmpty;

/**
 * Created by MinKyu Kim
 * Created on 2022-02-17.
 **/
public class GreetingsRequestDto {


    @NotEmpty
    private String name;
}
