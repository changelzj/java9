package com.example.test;

import com.example.bean.Person;
import org.junit.Test;

import java.util.logging.Logger;

public class Main {
    public static final Logger logger = Logger.getLogger("Main");
    
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        logger.info("hello world");
    }

    @Test
    public void test() {
        System.out.println("test");
    }
}
