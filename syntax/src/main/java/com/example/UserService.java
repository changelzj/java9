package com.example;

/**
 * 7- 全局常量 抽象方法
 * 8 default和静态方法
 * 9 私有方法
 */
public interface UserService {
    
    public abstract void method();
    
    public default void method2() {
        method4();
        System.out.println("method2");
    }
    
    public static void method3() {
        System.out.println("method3");
    }
    
    private void method4() {
        System.out.println("method4");
    }
}
