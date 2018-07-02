package com.edu.springboot.demo;


import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootConfiguration
//@Conditional(UTF8Conditioin.class) //也可以用在类上
public class MyConfig {

    @Bean
    @Conditional(UTF8Conditioin.class)
    public EncodingConvert createUTF8EncodingConvert() {
        return new UTF8EncodingConvert();
    }


    @Bean
    @Conditional(GBKConditioin.class)
    public EncodingConvert createGBKEncodingConvert() {
        return new GBKEncodingConvert();
    }

    @Bean
    @ConditionalOnMissingClass("com.mysql.jdbc.Driver")
    public Runnable createRun() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("classpath下不存在com.mysql.jdbc.Driver 装载我");
            };
        };
    }

    @Bean
    @ConditionalOnMissingBean(name = "user")
    public Runnable createRR() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("不存在user bean时装载我");
            };
        };
    }
}
