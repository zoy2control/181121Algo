package com.zoy2control.algo.sort.util;

/**
 * Created by zouzp on 2018/11/22.
 */
public class GeneratorUtils {
    private int[] arr;

    public GeneratorUtils(int[] arr) {
        this.arr = arr;
    }

    public void printArr(int[] arr) {
        if (null != arr) {
            int len = arr.length;

            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
