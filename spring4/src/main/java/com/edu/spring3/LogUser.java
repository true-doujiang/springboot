package com.edu.spring3;

public class LogUser extends User {

    @Override
    public void show() {
        System.out.println("log init");
        super.show();
        System.out.println("log over");
    }
}
