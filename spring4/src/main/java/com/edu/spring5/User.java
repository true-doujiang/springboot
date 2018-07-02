package com.edu.spring5;

import javax.annotation.PostConstruct;

public class User {

    @PostConstruct
    public void init() {
        System.out.println("user init");
    }


}
