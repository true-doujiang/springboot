package com.edu.spring5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Bean的后置处理器  每个bean的初始化都会触发它
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor{


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("=============postProcessBeforeInitialization    bean=" + bean + "   beanName=" + beanName);
        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("=============postProcessAfterInitialization    bean=" + bean + "   beanName=" + beanName);
        return bean;
    }
}
