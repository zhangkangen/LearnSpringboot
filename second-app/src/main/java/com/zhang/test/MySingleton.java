package com.zhang.test;

/**
 * 双重锁检查
 */
public class MySingleton {

    private volatile static MySingleton instance;

    private MySingleton() {

    }

    public static MySingleton getInstance() {
        synchronized (MySingleton.class) {
            if (instance == null) {
                instance = new MySingleton();
            }
            return instance;
        }
    }

    public void test() {
        System.out.println("ok" + Thread.currentThread().getName());
    }
}
