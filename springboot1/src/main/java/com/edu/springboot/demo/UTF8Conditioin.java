package com.edu.springboot.demo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class UTF8Conditioin implements Condition {


    /**
     *
     * @param conditionContext
     * @param annotatedTypeMetadata
     * @return true 会创建bean   false不创建
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String encoding = System.getProperty("file.encoding");
        if (encoding != null) {
            return "UTF-8".equalsIgnoreCase(encoding);
        }
        return false;
    }


}
