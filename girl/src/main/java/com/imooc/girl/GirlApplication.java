package com.imooc.girl;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GirlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GirlApplication.class, args);
//
//        SpringApplication application = new SpringApplication(GirlApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.run(args);
    }
}
