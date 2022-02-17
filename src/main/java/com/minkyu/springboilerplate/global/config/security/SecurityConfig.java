package com.minkyu.springboilerplate.global.config.security;

import com.minkyu.springboilerplate.global.config.security.error.AuthEntryPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MinKyu Kim
 * Created on 2022-02-17.
 **/
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().disable() // 기본설정 해제
                .csrf().disable() //csrf 보안 토큰 disable
                .cors()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) // 토큰 기반 인증이므로 세션 관리를 하지 않음
                .and()
                .authorizeRequests() // 요청에 대한 권한 체크
                .antMatchers("/*").permitAll()
                .antMatchers("/admin").hasAnyRole( "ADMIN")
                .anyRequest().permitAll()
//                .and()
//                .addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider),
//                        UsernamePasswordAuthenticationFilter.class);
    // JwtAuthenticationFilter를 UsernamePasswordAuthenticationFilter 전에 넣는다
                .and()
                .exceptionHandling()
                .authenticationEntryPoint(new AuthEntryPoint());
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        //Orgin -> 모든 URL  CODRS 요청 허용.
        //Orgin -> 모든 Http Header CORS 요청 허용.
        //Orgin -> 모든 Http Method CORS 요청 허용.
        configuration.addAllowedOrigin("*");
        configuration.addAllowedMethod("*");
        configuration.addAllowedHeader("*");
        configuration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        //모든 URL Path값에 적용.
        source.registerCorsConfiguration("/**", configuration);
        return source;

    }

    // 패스워드 암호화 bean
    @Bean
    public PasswordEncoder passwordEncoder() {
        return  PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
