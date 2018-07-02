package com.edu.spring3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Inject;

/**‘
 * 依赖注入： 3种
 * 1、@Autowired
 * 2、implements ApplicationContextAware
 * 3、spring4.3新特性  有局限性，当有多个构造函数时不一定好使了
 */

/**
@Component
public class User {

    @Autowired
    //@Resource
    //@Inject
    ApplicationContext applicationContext;

    public void show() {
        System.out.println(applicationContext);
    }

    @PostConstruct
    public void init() {
        System.out.println(" User init ");
    }

    @Override
    public String toString() {
        return "User{" + "applicationContext=" + applicationContext +  '}';
    }
}
 */

//ApplicationContextAware 原理分析
/**   */
@Component
public class User implements ApplicationContextAware {

    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void show() {
        System.out.println(applicationContext);
    }

    @Override
    public String toString() {
        return "User{" + "applicationContext=" + applicationContext +  '}';
    }
}




/**
@Component
public class User{

    ApplicationContext applicationContext;
    Dog dog;

    //spring4.3新特性 构造器需什么对象spring容器就给你什对象，前提是spring容器里要有这个对象。  如果有多个构造器spring默认会调用默认构造器
    public User(ApplicationContext applicationContext, Dog dog) {
        this.applicationContext = applicationContext;
        this.dog = dog;
    }

    public void show() {
        System.out.println(applicationContext);
    }

    @Override
    public String toString() {
        return "User{" +
                "applicationContext=" + applicationContext +
                ", dog=" + dog +
                '}';
    }
}
 */