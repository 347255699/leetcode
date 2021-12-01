package org.menfre;

/**
 * 范围求和 II
 * @author menfre
 */
public class MaxCount {

    public int maxCount(int m, int n, int[][] ops) {
        int minA = m;
        int minB = n;
        for (int[] op : ops) {
            minA = Math.min(op[0], minA);
            minB = Math.min(op[1], minB);
        }
        return minA * minB;
    }

    public static void main(String[] args) {
        int[][] nums = {{2, 2}, {3, 3}};
        System.out.println(new MaxCount().maxCount(3, 3, nums));
    }
}
