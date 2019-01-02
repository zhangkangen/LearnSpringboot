package com.zhang.test;

public class SortDemo {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 4, 55, 66, 7, 8, 23, 2};
        sortMethod(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void sortMethod(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
