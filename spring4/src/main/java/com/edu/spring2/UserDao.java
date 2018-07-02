package com.edu.spring2;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public void jdbc() {
        System.out.println("jdbc");
    }

    @Override
    public String toString() {
        return "UserDao{}";
    }
}
