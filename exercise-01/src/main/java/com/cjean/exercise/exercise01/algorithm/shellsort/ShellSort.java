package com.cjean.exercise.exercise01.algorithm.shellsort;

import java.util.Arrays;

/**
 * 选择排序算法
 * 选出最小的放到当前循环范围的第一个位置
 */
public class ShellSort {

    public static int[] ShellSort(int[] array) {
        int len = array.length;
        int gra = len / 2;
        int temp;
        while (gra > 0) {
            for (int i = gra; i < len; i++) {
                temp = array[i];
                int preIndex = i - gra;
                while (preIndex >= 0 && temp < array[preIndex]) {
                    array[preIndex + gra] = array[preIndex];
                    preIndex -= gra;
                }
                array[preIndex + gra] = temp;
            }
            gra /= 2;
        }
        System.out.println(Arrays.toString(array));
        return array;

    }

    public static void main(String[] args) {
        int[] args1 = {12, 134, 195, 21, 1, 61, 981, 88};
        int[] args2 = null;
        ShellSort(args1);
    }
}
