package com.edu.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 *  若是没有明确定义可以使用 @Component
 */
@Controller
public class UserController {

    //@Autowired  spring注解
//    @Resource JSR-250注解
    @Inject  //JSR-330注解   需要添加maven依赖
    @Qualifier(value = "userService")
    UserService userService;

    @Override
    public String toString() {
        return "UserController{" +
                "userService=" + userService +
                '}';
    }
}
