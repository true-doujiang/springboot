package com.edu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * springboot事件监听
 */
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootApplication.class);
		//注册事件监听器,也可以直接加@Component让spring容器管理起来
		//app.addListeners(new MyApplicationListener());

        ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
        //发布事件
        MyApplicationEvent event = new MyApplicationEvent(new Object());
        event.setName("打报告");
        context.publishEvent(event);

		context.close();
	}
}
