package com.minkyu.springboilerplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBoilerplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoilerplateApplication.class, args);
    }

}
