package com.edu.spring5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;


/**
 * BeanFactoryPostProcessor对spring容器就行拦截（回调）
 * 它的子类BeanDefinitionRegistryPostProcessor更强，可以动态的往容器里注册bean
 *
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

    /**
     * spring容器初始化之后执行,在BeanPostProcessor之前执行
     *
     * @param configurableListableBeanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("+++++++++++++容器里有多少个bean: " + configurableListableBeanFactory.getBeanDefinitionCount());
    }
}
