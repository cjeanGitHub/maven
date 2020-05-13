package com.cjean.exercise.exercise01.algorithm;


import java.util.Arrays;

/**
 * 插入排序算法
 * 
 * @author chu_c
 *
 */
public class InsertSort {

	public static void sort2(int[] arr) {
		System.out.println("-----start------");
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------");

		int len = arr.length;

		for (int i = 1; i < len; i++) {
			int temp = arr[i];
			int index = i-1;
			while (index>=0&&temp<arr[index]) {
				arr[index+1] = arr[index];
				index--;
			}
			arr[index+1] = temp;

		}
		System.out.println("------end-----");
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------");

	}

	public static void main(String[] args) {
		int[] args1 = { 12, 134, 195, 21, 1, 61, 981, 88};
		int[] args2 = null;
		sort2(args1);
	}

}