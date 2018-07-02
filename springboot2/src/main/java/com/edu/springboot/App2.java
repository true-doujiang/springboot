package com.edu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import(Cat.class) //Cat本类没有本spring托管   用@Import导入进来就托管了，这也是@Enable*注解的原理
@ComponentScan
public class App2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);

		Cat cat = context.getBean(Cat.class);
		System.out.println(cat);

		context.close();
	}
}
