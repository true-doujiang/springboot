package com.edu.springboot.JdbcConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class JdbcProperties {

    @Value("${jdbc.username}")
    String username;

    @Value("${jdbc.password}")
    String password;

    @Value("${jdbc.port:3307}") //可以指定默认值
    Integer port;

    @Value("${jdbc.jdbc}")
    String jdbc;

    @Autowired
    Environment env;


    public void show() {
        System.out.println(env.getProperty("jdbc.username"));
        System.out.println(env.getProperty("jdbc.password"));
        System.out.println(env.getProperty("jdbc.port"));
        System.out.println(env.getProperty("jdbc.jdbc"));
    }


    @Override
    public String toString() {
        return "JdbcProperties{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", port=" + port +
                ", jdbc='" + jdbc + '\'' +
                '}';
    }
}
