package com.edu.spring4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * spring容器内部也是通过BeanPostProcessor实现的
 * 参考ApplicationContextAwareProcessor
 */
@Component
public class ContextBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof SpringContextAware) {
            SpringContextAware sca = (SpringContextAware) bean;
            sca.setApplicationContext(applicationContext);
        }
        if (bean instanceof BeanFactoryAware) {
            BeanFactoryAware bfa = (BeanFactoryAware) bean;
            bfa.setBeanFactory(null);
        }
        //... 其它Aware

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
