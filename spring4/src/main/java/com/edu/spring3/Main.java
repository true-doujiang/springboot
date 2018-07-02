package com.edu.spring3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示 BeanPostProcessor
 */
public class Main {

    public static void main(String[] args) {
        //会扫描到MyConfig配置类  MyConfig再把Bean添加到容器里。 若MyConfig没有实例化bean，则可以直接在bean上加@Component
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.edu.spring3");

        User user = context.getBean(User.class);
        System.out.println(user);
        user.show();
        context.destroy();
    }
}
