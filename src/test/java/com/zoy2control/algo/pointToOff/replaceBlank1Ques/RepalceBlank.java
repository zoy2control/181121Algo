package com.zoy2control.algo.pointToOff.replaceBlank1Ques;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by zouzp on 2018/12/3.
 */
public class RepalceBlank {

    @Test
    public void test01() {
        String s = "hello world!";
        replaceBlankWithCollections(s);// ·eq1
//        replaceBlankWithArray(s);// ·eq2
//        replaceBlankWithInnerReplace(s);// ·eq3
    }

    private void replaceBlankWithCollections(String s) {
        if(0 != s.length()) {
            char[] chars = s.toCharArray();
            ArrayList<Character> result = new ArrayList<>();

            for (int i = 0; i < chars.length; i++) {
                if (' ' == chars[i]) {
                    result.add('%');
                    result.add('2');
                    result.add('0');
                } else {
                    result.add(chars[i]);
                }
            }
//            System.out.println(result.toString());// ·这样会输出是ArrayList整个数组，含","的结果
            for(Character item : result) {// ·遍历 输出
                System.out.print(item.toString());
            }
            System.out.println();
        }
    }

    private void replaceBlankWithArray(String s) {
        if(0 != s.length()) {
            char[] chars = s.toCharArray();
            int len = chars.length;
            char[] result = new char[len * 3];// ·用 char[]来存储 结果，需明确指定 数组大小
            int j = 0;

            for (int i = 0; i < chars.length; i++) {
                if (' ' == chars[i]) {
                    result[j++] = '%';
                    result[j++] = '2';
                    result[j++] = '0';
                } else {
                    result[j++] = chars[i];
                }
            }
            System.out.println(new String(result));// ·char[]转 String
        }
    }

    private void replaceBlankWithInnerReplace(String s) {
        if(0 != s.length()) {
            String result = s.replaceAll(" ", "%20");// ·String自带 replace()
            System.out.println(result);
        }
    }
}
