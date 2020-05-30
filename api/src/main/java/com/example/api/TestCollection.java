package com.example.api;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class TestCollection {
    
    
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // 变为只读
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.forEach(System.out::println);
        unmodifiableList.add("dfd");
    }
    
    @Test
    public void test2() {
        Set<String> strings = Collections.unmodifiableSet(new HashSet<>() {
            {
                add("bbbbb");
                add("aaaa");
                add("cccc");
            }
        });


        Map<String, String> map = Collections.unmodifiableMap(new HashMap<>() {
            {
                put("aa", "aaaa");
                put("cc", "cccc");
                put("bb", "bbbbbbbb");
            }
        });

        System.out.println(strings);
        System.out.println(map);
    }
    
    @Test
    public void test3() {
        // 只读的
        List<String> list = List.of("111", "222");
        Set<String> strings = Set.of("111", "2223");
        Map<String, String> map = Map.of("aaa", "111", "bbb", "222");
        Map<String, Integer> map1 = Map.ofEntries(Map.entry("age", 15));
    }

    
}
