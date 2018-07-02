package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan//(basePackages={"com.edu.spring"})
public class Main3 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main3.class);
        System.out.println(context.getBean(HelloBean.class));
        System.out.println(context.getBean("mybean"));

        context.close();
    }
}
