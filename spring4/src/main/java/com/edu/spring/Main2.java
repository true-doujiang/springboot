package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.edu.spring"); //制定要扫描的包名
        System.out.println(context.getBean(HelloBean.class));
        System.out.println(context.getBean("mybean"));

        context.close();
    }
}
