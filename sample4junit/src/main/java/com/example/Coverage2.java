package com.example;

public class Coverage2 {
    private int num;

    Coverage2(int n) {
        num = n;
    }

    public static void test(int i) {
        System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i));
    }
}
