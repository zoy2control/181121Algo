package com.zoy2control.algo.sort.bubble;

import org.junit.Test;

/**
 * Created by zouzp on 2018/11/21.
 */
public class BubbleSort {
    @Test
    public void test01() {
        int[] arr = {5,4,2,1,3};
        arr = this.bubbleSort(arr);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private void initArr(int[] arr) {
        if (null != arr) {

        }
    }

    private int[] bubbleSort(int[] arr) {
        if (null != arr) {
            int len = arr.length;
            int tmp = Integer.MIN_VALUE;
            long begin = System.currentTimeMillis();
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
            long end = System.currentTimeMillis();
            System.out.println(end - begin);
        }
        return arr;
    }
}
