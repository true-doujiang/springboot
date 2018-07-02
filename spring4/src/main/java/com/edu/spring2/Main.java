package com.edu.spring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        //靠 居然要这么放进去,而且这些类上不用加任何注解的。 因为这里没有使用MyConfig
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                UserDao.class,
                UserService.class,
                UserController.class
        );

        System.out.println(context.getBean(UserDao.class));
        System.out.println(context.getBean(UserService.class));
        System.out.println(context.getBean(UserController.class));
    }
}
