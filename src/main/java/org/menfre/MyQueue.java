package org.menfre;

import java.util.Stack;

/**
 * 用栈实现队列
 * @author menfre
 */
public class MyQueue {

    private final Stack<Integer> stack0;
    private final Stack<Integer> stack1;

    public MyQueue() {
        stack0 = new Stack<>();
        stack1 = new Stack<>();
    }

    public void push(int x) {
        stack0.push(x);
    }

    public int pop() {
        if(stack1.isEmpty()){
            while (!stack0.isEmpty()) {
                stack1.push(stack0.pop());
            }
        }
        return stack1.pop();
    }

    public int peek() {
        if(stack1.isEmpty()){
            while (!stack0.isEmpty()) {
                stack1.push(stack0.pop());
            }
        }
        return stack1.peek();
    }

    public boolean empty() {
        return stack0.isEmpty() && stack1.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}
