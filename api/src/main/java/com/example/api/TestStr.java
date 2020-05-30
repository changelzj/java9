package com.example.api;

import org.junit.Test;

public class TestStr {

    /**
     * java9 string底层存储变化 char[] -> byte[]
     * 
     * StringBuffer 同理
     * StringBuilder 同理
     * 
     */
    @Test
    public void test() {
        String s = "";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
    }
}
