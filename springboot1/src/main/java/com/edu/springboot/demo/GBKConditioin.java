package com.edu.springboot.demo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class GBKConditioin implements Condition {


    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String encoding = System.getProperty("file.encoding");
        if (encoding != null) {
            return "GBK".equalsIgnoreCase(encoding);
        }
        return false;
    }


}
