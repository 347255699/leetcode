package org.menfre;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 最小栈
 *
 * @author menfre
 */
public class MinStack {

    private List<Integer> arr;

    public MinStack() {
        this.arr = new ArrayList<>();
    }

    public void push(int val) {
        arr.add(val);
    }

    public void pop() {
        arr.remove(arr.size() - 1);
    }

    public int top() {
        return arr.get(arr.size() - 1);
    }

    public int getMin() {
        int min = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            min = Math.min(min, arr.get(i));
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
