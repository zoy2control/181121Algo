package com.zoy2control.algo.sort.quick;

import org.junit.Test;


/**
 * Created by zouzp on 2018/11/21.
 */
public class QuickSort {
    @Test
    public void test01() {
        int[] arr = {5,4,3,1,2};
        int len = arr.length;
        this.quickSort01(arr,0, len - 1);

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    private int[] quickSort01(int[] arr, int left, int right) {
        if (left < right && null != arr) {
            int mid = (left + right)/2;
            int tmp = Integer.MIN_VALUE;
            int l = left;
            int r = right;

            for (; l < mid; l++) {
                if (arr[l] > arr[mid]) {
                    for(;r > mid; r--) {

                    }
                }
                printArr(arr);
            }


            this.quickSort01(arr, left, mid - 1);
            this.quickSort01(arr, mid + 1, right);
        }
        return arr;
    }

    private void printArr(int[] arr) {
        if (null != arr) {
            int len = arr.length;

            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
