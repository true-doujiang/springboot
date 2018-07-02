package com.edu.springboot;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Dog {


    @Async
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("run。。。。。。。。。。" + i);
        }
    }
}
