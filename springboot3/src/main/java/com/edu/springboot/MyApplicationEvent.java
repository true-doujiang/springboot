package com.edu.springboot;

import org.springframework.context.ApplicationEvent;

/**
 * 定义事件
 */
public class MyApplicationEvent extends ApplicationEvent {

    private String name;

    public MyApplicationEvent(Object source) {
        super(source);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyApplicationEvent{" +
                "name='" + name + '\'' +
                '}';
    }
}
