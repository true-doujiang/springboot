package com.edu.springboot;

import org.springframework.context.annotation.Bean;

public class App {

    @Bean
    public Runnable createRunnable() {
        return () -> {
            System.out.println("App run....");
        };
    }
}
