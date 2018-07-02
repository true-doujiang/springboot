package com.edu.springboot.lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import javax.naming.Name;
import java.util.HashSet;

/**
 * SpringBootApplication是一个组合注解
 * @SpringBootConfiguration
 * @EnableAutoConfiguration  自动装配了与第三方整合的组件
 * @ComponentScan
 *
 * 而SpringBootConfiguration（springboot提供）又组合了 @Configuration（spring提供）
 */
@SpringBootApplication
//@ComponentScan   //同上？？
public class Lesson1Application {


    @Bean
//    @Scope(value = "prototype")
    public Runnable createRunnable() {
        return () -> {
            System.out.println("springboot running");
        };
    }



    public static void main(String[] args) {
        //第一种 使用SpringApplication静态方法run
                                                                        //入口类
        ConfigurableApplicationContext context = SpringApplication.run(Lesson1Application.class, args);
        Runnable bean = context.getBean(Runnable.class);
        System.out.println(bean);
        bean.run();

        User u = context.getBean(User.class);
        System.out.println(u);
//
        //第二种 使用SpringApplication实例
//        SpringApplication application = new SpringApplication();
//        HashSet sets = new HashSet();
//        sets.add(App2.class);  //可以指定多个源
//        application.setSources(sets);
//        ConfigurableApplicationContext context = application.run(args);
//        context.getBean(Runnable.class).run();
    }
}
