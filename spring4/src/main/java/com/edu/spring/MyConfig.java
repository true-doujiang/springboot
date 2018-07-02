package com.edu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {


    /**
     * createHBean 方法的名字默认就是bean的名字
     * @return
     */
    @Bean(name = "mybean") //指定bean的名字
    @Scope(value = "prototype") //指定非单例
    //@Primary  //第一种：当有多个bean时优先使用我。 第二种： 就是在注入的地方@Qualifier
    public HelloBean createHBean() {
        return new HelloBean();
    }

    @Bean
    public RunnableFactoryBean createRunnableFactoryBean() {
        return new RunnableFactoryBean();
    }


    /**
     * 这种工厂方式有什么意思？？
     * @return
     */
    @Bean
    public CarFactory createCarFactory() {
        return new CarFactory();
    }
    @Bean
    public Car createCar(CarFactory factory) {
        return factory.create();
    }

    /**
     * 演示生命周期
     */
    //第一、二种
    @Bean
    public Dog createDog() {
        return new Dog();
    }
    //第三种
//    @Bean(initMethod = "abc", destroyMethod = "xyz")
//    public Dog createDog() {
//        return new Dog();
//    }
}
