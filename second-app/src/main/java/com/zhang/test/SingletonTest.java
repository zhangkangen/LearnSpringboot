package com.zhang.test;

public class SingletonTest {
    public static void main(String[] args) {

        MySingleton.getInstance().test();
        StaticSingleton.getInstance().test();
    }
}
