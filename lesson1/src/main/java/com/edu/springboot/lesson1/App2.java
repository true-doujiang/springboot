package com.edu.springboot.lesson1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * author: youhh
 * date: 2018/5/27 下午6:11
 * description:
 */
@SpringBootApplication
public class App2 {


    @Bean
    public Runnable createRunnable() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("App2 Runnable");
            }
        };
    }
}
