package com.zhang.test;

public class ClassB  extends ClassA{
    public ClassB(){
        System.out.println("ClassB");
    }
    {
        System.out.println("I am ClassB");
    }
    static {
        System.out.println("I am static ClassB");
    }
}
