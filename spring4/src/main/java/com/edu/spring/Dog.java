package com.edu.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *  用于演示Bean的声明周期
 *  第一种：实现InitializingBean, DisposableBean接口 分别实现他们的方法   不推荐使用
 */
//public class Dog implements InitializingBean, DisposableBean{
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("init");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroy");
//    }
//}

/**
 *  用于演示Bean的声明周期
 *  第三种：
 */
public class Dog {

    @PostConstruct
    public void abc() {
        System.out.println("init");
    }

    @PreDestroy
    public void xyz() {
        System.out.println("destroy");
    }
}

/**
 *  用于演示Bean的声明周期
 *  第三种：
 */
//public class Dog {
//
//    public void abc() {
//        System.out.println("init");
//    }
//
//    public void xyz() {
//        System.out.println("destroy");
//    }
//}