package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(context.getBean(HelloBean.class));  //按类型获取时 若有俩个HelloBean类型的Bean会报错
        System.out.println(context.getBean("mybean")); //按name获取时 若有俩个Bean的name相同会报错

        //获取Runnable对象  他是由工厂生产出来的
        System.out.println(context.getBean("createRunnableFactoryBean"));
        System.out.println(context.getBean(Runnable.class));
        //获取工厂对象本身
        System.out.println(context.getBean(RunnableFactoryBean.class));
        System.out.println(context.getBean("&createRunnableFactoryBean"));

        //
        System.out.println(context.getBean("createCar"));
        System.out.println(context.getBean(Car.class));

        //演示生命周期
        //System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean("createDog"));
        //可以查看到当前bean的名字
        System.out.println(context.getBeansOfType(Car.class));
        context.close();
    }
}
