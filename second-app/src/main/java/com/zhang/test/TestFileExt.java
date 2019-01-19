package com.zhang.test;

public class TestFileExt {

    public static void main(String[] args) {
        String fileName = "sldjflasdjfasdf.mp3";

        String ext = fileName.substring(fileName.indexOf("."));
        System.out.println(ext);
    }
}
