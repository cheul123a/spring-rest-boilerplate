package com.minkyu.springboilerplate.domain.example.controller;

import com.minkyu.springboilerplate.domain.example.service.ExampleService;
import com.minkyu.springboilerplate.global.common.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MinKyu Kim
 * Created on 2022-02-17.
 **/

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ExampleController {

    private final ExampleService exampleService;

    @GetMapping("/greeting")
    public ResponseEntity<?> greetings() {
        SuccessResponse<?> result = exampleService.greetings();
        return ResponseEntity.ok(result);
    }
}
