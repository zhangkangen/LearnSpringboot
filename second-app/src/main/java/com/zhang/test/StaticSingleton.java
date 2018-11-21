package com.zhang.test;

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
