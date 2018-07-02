package com.edu.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * implements FactoryBean 专门用于生产<T>型bean的工厂
 */
public class RunnableFactoryBean implements FactoryBean<Runnable> {

    /**
     * 返回生产的对象
     * @return
     */
    @Override
    public Runnable getObject() throws Exception {
        return () -> {};
    }

    /**
     *  返回生产对象的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Runnable.class;
    }

    /**
     *  true 单例    false 非单例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
