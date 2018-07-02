package com.edu.spring4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public interface SpringContextAware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
