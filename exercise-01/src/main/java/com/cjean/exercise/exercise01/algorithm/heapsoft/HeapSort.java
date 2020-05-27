package com.cjean.exercise.exercise01.algorithm.heapsoft;

import java.util.Arrays;

/**
 * Created by chengxiao on 2016/12/17.
 * 堆排序demo  222
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};// 9
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr3 = {1, 2, 3, 7, 5, 6, 4, 8, 9};
        int[] arr4 = {3, 2, 4, 1, 5, 11, 13, 10, 19};
        int[] arr5 = {3, 2, 4, 1, 5};
        int[] arr6 = {3, 2, 4, 1, 5, 7 , 10};
//        sort(arr);
//        sort(arr3);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr3));
//        sort(arr2);
//        sort(arr3);
//        sort(arr4);
//        sort(arr5);
        sort(arr6);
    }

    public static void sort(int[] arr) {
        //1.构建大顶堆
        //  i = arr.length / 2 - 1 : 由于堆是就是逻辑节后中的完全二叉树结构，所以这个算法可以直接找到二叉树顺序上最后一个根节点；
        //形成一个伪大顶堆。左边的进行比较交换过
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.length);

            System.out.println("first:" + i);
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("==================");
        //2.调整堆结构+交换堆顶元素与末尾元素
        for (int j = arr.length - 1; j > 0; j--) {
            swap(arr, 0, j);//将堆顶元素与末尾元素进行交换
            System.out.println(Arrays.toString(arr));
            System.out.println("-------------");
            adjustHeap(arr, 0, j);//重新对堆进行调整
            System.out.println(Arrays.toString(arr));
            System.out.println("second:" + j);
        }

    }


    /**
     * 调整小顶堆（仅是调整过程，建立在小顶堆已构建的基础上）
     *
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];//先取出当前元素i
        //k * 2 + 1 获取k索引下的左节点，由于堆是完全二叉树的原因可以认为，k没有左节点就是>length
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {//从i结点的左子结点开始，也就是2i+1处开始
            if (k + 1 < length && arr[k] > arr[k + 1]) {//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if (arr[k] < temp) {//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     *
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap2(int[] arr, int i, int length) {
        int temp = arr[i];//先取出当前元素i
        //k * 2 + 1 获取k索引下的左节点，由于堆是完全二叉树的原因可以认为，k没有左节点就是>length
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {//从i结点的左子结点开始，也就是2i+1处开始
            if (k + 1 < length && arr[k] < arr[k + 1]) {//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if (arr[k] < temp) {//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }

    /**
     * 交换元素
     *
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}