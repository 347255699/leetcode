package org.menfre;

import java.util.*;

/**
 * 数据流中的第 K 大元素
 * @author menfre
 */
public class KthLargest {

    private final PriorityQueue<Integer> pq;
    private final int k;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        pq.offer(val);
        if(pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {

    }
}
