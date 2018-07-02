package com.edu.spring5;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public User createUser() {
        return new User();
    }

    @Bean
    public User createUser2() {
        return new User();
    }
}
