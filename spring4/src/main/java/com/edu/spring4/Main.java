package com.edu.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示  Aware的基本原理
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.edu.spring4");

        User user = context.getBean(User.class);
        System.out.println(user);
        user.show();
        context.destroy();
    }
}
