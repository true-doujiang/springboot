package com.modu.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * author: youhh
 * date: 2018/5/29 下午7:18
 * description:
 */
public class Main {

    public static void main(String[] args) {
        List<User> list = null;

//        list.add(new User());
//
//        for (User u : list) {
//            System.out.println(u);
//        }

        /* 建立一个数组 */
        int[] integers = null;

        /* 开始遍历 */
//        for (int i : integers) {
//            System.out.println(i); /* 依次输出“1”、“2”、“3”、“4” */
//        }
//

        Arrays.asList("a", "b", "n").forEach(item -> {
            System.out.println(item);
        });
    }
}
