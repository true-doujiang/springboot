package com.edu.springboot.JdbcConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    String name;

    Integer age;

    List<String> hosts = new ArrayList<>();

    //必须有set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }
    //集合还必须有get方法
    public List<String> getHosts() {
        return hosts;
    }

    @Override
    public String toString() {
        return "GirlProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hosts=" + hosts +
                '}';
    }
}
