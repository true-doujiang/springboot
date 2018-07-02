package com.edu.springboot;

import com.edu.springboot.JdbcConfig.GirlProperties;
import com.edu.springboot.JdbcConfig.JdbcProperties;
import com.edu.springboot.demo.EncodingConvert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

/**
 * springboot快速入门
 *
 *
 *
 * @SpringBootApplication 组合注解
 */
@SpringBootApplication
public class SpringbootApplication {

	@Bean
	public Runnable createRunnable() {
		return () -> {
			System.out.println("run....");
		};
	}

	public static void main(String[] args) {
								//入口类会自动变成配置类，所以上面的@SpringBootApplication注解不加也ok
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		//ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		Runnable r = (Runnable) context.getBean("createRunnable");
		r.run();

		//====================================springboot配置分析
		JdbcProperties jdbc = context.getBean(JdbcProperties.class);
		System.out.println(jdbc);
		jdbc.show();

		GirlProperties girl = context.getBean(GirlProperties.class);
		System.out.println(girl);

		//====================================springboot条件装配bean
		/** 自带了好多条件注解
		@ConditionalOnBean
		@ConditionalOnMissingBean
		*/
		Map map = context.getBeansOfType(EncodingConvert.class);
		System.out.println(map);
		Runnable run = (Runnable) context.getBean("createRun");
		run.run();

		Runnable rr = (Runnable) context.getBean("createRR");
		rr.run();


		context.close();
	}
}
