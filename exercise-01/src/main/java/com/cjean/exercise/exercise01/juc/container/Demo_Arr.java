package com.cjean.exercise.exercise01.juc.container;

public class Demo_Arr {
    public static void main(String[] args) {
        test_01();
    }

    static void test_01() {
        int[] a = null;
        a = new int[]{1, 2, 3};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
