package com.edu.springboot;


import com.edu.springboot.JdbcConfig.GirlProperties;
import com.edu.springboot.JdbcConfig.JdbcProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 只用于演示加载不同环境的配置
 *
 * 第一种
 * 带参数运行  --spring.profiles.active=test
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);

        //第二种
        //指定配置环境, 可以指定多个
        //app.setAdditionalProfiles("dev", "dev");

        ConfigurableApplicationContext context = app.run(args);


        JdbcProperties jdbc = context.getBean(JdbcProperties.class);
        System.out.println(jdbc);
        jdbc.show();

        GirlProperties girl = context.getBean(GirlProperties.class);
        System.out.println(girl);

        context.close();
    }
}
