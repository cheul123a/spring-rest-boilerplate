package com.minkyu.springboilerplate.global.config.security.error;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.minkyu.springboilerplate.global.common.ErrorResponse;
import com.minkyu.springboilerplate.global.error.code.SecurityErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by MinKyu Kim
 * Created on 2022-02-17.
 **/

@RequiredArgsConstructor
public class AuthEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, org.springframework.security.core.AuthenticationException authException) throws IOException {
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.setContentType("application/json;charset=UTF-8");

        PrintWriter writer = response.getWriter();
        writer.print(new ObjectMapper().writeValueAsString(getUnAuthorizedBody()));
    }

    private ErrorResponse getUnAuthorizedBody() {
        return new ErrorResponse(SecurityErrorCode.UNAUTHORIZED);
    }
}
