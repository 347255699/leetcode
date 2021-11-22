package org.menfre;

import java.util.ArrayList;
import java.util.List;

/**
 * 用队列实现栈
 *
 * @author menfre
 */
public class MyStack {

    private List<Integer> arr;

    public MyStack() {
        arr = new ArrayList<>();
    }

    public void push(int x) {
        arr.add(x);
    }

    public int pop() {
        return arr.remove(arr.size() - 1);
    }

    public int top() {
        return arr.get(arr.size() - 1);
    }

    public boolean empty() {
        return arr.isEmpty();
    }
}
