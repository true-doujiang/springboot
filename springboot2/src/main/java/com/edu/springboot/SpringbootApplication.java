package com.edu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @EnableConfigurationProperties  开启@ConfigurationProperties(prefix = "girl"), 否则这个注解不起作用
 * @EnableAsync 开启@Async
 *
 * 还讲了@EnableAutoConfiguration深入分析，没有听明白
 */
@EnableConfigurationProperties
@EnableAsync
@ComponentScan
//@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

		GirlProperties girl = context.getBean(GirlProperties.class);
		System.out.println(girl);

        Dog bean = context.getBean(Dog.class);
        bean.run();
        System.out.println("======Dog还没有run完就输出我，说明异步执行了======");

		context.close();


	}
}
