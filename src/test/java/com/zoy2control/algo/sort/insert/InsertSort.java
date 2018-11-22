package com.zoy2control.algo.sort.insert;

import com.zoy2control.algo.sort.util.GeneratorUtils;
import org.junit.Test;


/**
 * Created by zouzp on 2018/11/22.
 */
public class InsertSort {

    @Test
    public void test01() {
        int[] arr = {5,4,3,1,2,6};
        insertSort(arr);

        for(int item : arr) {
            System.out.print(item + " ");
        }
    }

    private void insertSort(int[] arr) {
        if (null != arr) {
            int len = arr.length;
            int box = Integer.MIN_VALUE;
            GeneratorUtils generatorUtils = new GeneratorUtils(arr);

            for(int i = 0; i < len - 1; i++) {
                generatorUtils.printArr(arr);
                for (int j = i; j >= 0; j--) {
                    int pos = j + 1;
                    if (arr[j] > arr[pos]) {
                        box = arr[pos];
                        arr[pos] = arr[j];
                        arr[j] = box;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
