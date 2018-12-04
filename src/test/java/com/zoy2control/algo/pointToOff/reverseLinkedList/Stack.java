package com.zoy2control.algo.pointToOff.reverseLinkedList;

import java.util.ArrayList;

/**
 * Created by zouzp on 2018/12/3.
 * ·自定义Stack
 */
public class Stack {
    private ArrayList<Integer> stack;
    private int top;

    Stack() {
        this.stack = new ArrayList();
        this.top = -1;
    }

    public void push(int i) {
        stack.add(i);
        top++;
    }

    public int pop() {
        int popResult = Integer.MIN_VALUE;
        if (0 != stack.size() && -1 != top) {
            popResult = stack.remove(top);
            top--;
        }
        return popResult;
    }
}
