package com.example.api;

import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TestStream {
    /**
     * java9新增的函数式接口
     *
     * takeWhile 有序，返回从开头开始尽可能多的元素
     *
     * dropWhile ： takeWhile剩余的元素
     *
     */
    @Test
    public void test4() {
        List<Integer> list = List.of(3, 4, 8, 5, 6, 9, 8, 7, 4, 1, 22, 44, 88, 66, 545, 21);

        list.stream().takeWhile(x -> x < 88).forEach(System.out::println);
        System.out.println("*********");
        list.stream().dropWhile(x -> x < 88).forEach(System.out::println);


    }

    /**
     * stream如果单个元素，不能为null
     * java9中 ofNullable 单个元素，能为null
     */
    @Test
    public void test5() {
        //Stream<Integer> stream = Stream.of(null);
        Stream<Integer> stream = Stream.ofNullable(null);
    }


    @Test
    public void test6() {
        // Stream.iterate(1, x -> x*2).limit(10);

        Stream.iterate(0, x -> x < 10, x -> x = x+1).forEach(System.out::println);

    }
    
    @Test
    public void optional() {
        List<Integer> list = List.of(3, 4, 8, 5, 6, 9, 8, 7, 4, 1, 22, 44, 88, 66, 545, 21);
        Optional<List<Integer>> optional = Optional.ofNullable(list);

        Stream<List<Integer>> stream = optional.stream();
        
        Stream<Integer> integerStream = optional.stream().flatMap(Collection::stream);
        
        stream.forEach(System.out::println);
    }
}
