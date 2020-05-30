package com.example;

import java.util.HashSet;
import java.util.Set;

public class Diamond {
    public static void main(String[] args) {
        //<>可以共用在匿名子类中
        Set<String> strings = new HashSet<>() {};
        
        strings.add("hello");
        System.out.println(strings);
    }
}
