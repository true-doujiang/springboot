package com.imooc.hotdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//@SpringBootApplication
public class HotdeployApplication extends SpringBootServletInitializer {

//    public static void main(String[] args) {
//        SpringApplication.run(HotdeployApplication.class, args);
//    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HotdeployApplication.class);
    }
}


/**
 * 打成war包
 *

 pom.xml
 1. <packaging>jar</packaging>
 2.




 */


