package com.edu.spring5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor是BeanFactoryPostProcessor子接口。对他进行了增强
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor{

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        //动态地往容器里注册10个bean
        for (int i=0; i<10; i++) {
            BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(Dog.class);
            bdb.addPropertyValue("dogName", "拉布拉多" + i);
            AbstractBeanDefinition definition = bdb.getBeanDefinition();
            beanDefinitionRegistry.registerBeanDefinition("dogBean" + i, definition);
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
