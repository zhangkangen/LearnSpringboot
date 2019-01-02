package com.zhang.test;

/**
 * 静态内部类
 */
public class StaticSingleton {
    private StaticSingleton() {

    }

    private static class SingletonHolder {
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public  void test() {
        System.out.println("ok===" + Thread.currentThread().getName());
    }
}
