package com.edu.spring3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Bean的后置处理器  每个bean的初始化都会触发它
 */
@Component
public class EchoBeanPostProcessor implements BeanPostProcessor{

    /**
     * bean的set方法 或者 @Autowired 执行后在执行该方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("=============postProcessBeforeInitialization    bean=" + bean + "   beanName=" + beanName);
        //这里可以对一些bean做处理
        if (bean instanceof User) {
            return new LogUser();
        }
        return bean;
    }

    /**
     * bean的init方法执行后会执行该方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("=============postProcessAfterInitialization    bean=" + bean + "   beanName=" + beanName);
        return bean;
    }
}
