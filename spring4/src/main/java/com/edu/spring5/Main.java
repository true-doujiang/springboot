package com.edu.spring5;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示 BeanFactoryPostProcessor
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.edu.spring5");
        User u = (User) context.getBean("createUser");

        //获取所有的Dog bean
        context.getBeansOfType(Dog.class).values().forEach(System.out::println);


        /**
         * 这种方式也可以动态地往容器里添加bean
         */
        //动态地往容器里注册10个bean
        for (int i=0; i<10; i++) {
            BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(Cat.class);
            bdb.addPropertyValue("catName", "tom" + i);
            AbstractBeanDefinition definition = bdb.getBeanDefinition();
            context.registerBeanDefinition("catBean" + i, definition);
        }
        //获取所有的Dog bean
        context.getBeansOfType(Cat.class).values().forEach(System.out::println);

        context.close();
    }
}
