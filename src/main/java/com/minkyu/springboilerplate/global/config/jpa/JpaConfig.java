//package com.minkyu.springboilerplate.global.config.jpa;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//
//import javax.sql.DataSource;
//
///**
// * Created by MinKyu Kim
// * Created on 2022-02-17.
// **/
//
//@Configuration
//@EnableJpaAuditing
//public class JpaConfig {
//
//    @Primary
//    @Bean(name = "dataSource")
//    @ConfigurationProperties("spring.datasource.hikari")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create()
//                .type(HikariDataSource.class)
//                .build();
//    }
//
//}
