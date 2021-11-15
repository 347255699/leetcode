package org.menfre;

/**
 * 爬楼梯
 *
 * @author menfre
 */
public class ClimbStairs {

    /**
     * 使用滚动数组策略
     *
     * @param n 台阶数量
     * @return 上台阶的方法数量
     */
    public int climbStairs(int n) {
        int p, q = 0, r = 1;
        for (int i = 0; i < n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(new ClimbStairs().climbStairs(i) + ", ");
        }
    }
}
