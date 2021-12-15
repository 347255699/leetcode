package org.menfre;

/**
 * 使用最小花费爬楼梯
 *
 * @author menfre
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0], b = cost[1], r;
        for (int i = 2; i < cost.length; i++) {
            r = Math.min(a, b) + cost[i];
            a = b;
            b = r;
        }
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        int[] num = {10, 15, 20};
        System.out.println(new MinCostClimbingStairs().minCostClimbingStairs(num));
    }
}
