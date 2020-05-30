package com.example;


import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestException {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        // java9自动关闭资源 , reader writer均默认为final
        try(reader; writer) {
            reader.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
