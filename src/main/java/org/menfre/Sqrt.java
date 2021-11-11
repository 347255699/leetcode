package org.menfre;

/**
 * x 的平方根
 *
 * @author menfre
 */
public class Sqrt {
    public int mySqrt(int x) {
        int l = 0, h = x, k = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            // mid * mid 可能会超过 2^31 - 1，需要通过 long 来扩大位数
            if ((long) mid * mid <= x) {
                k = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(new Sqrt().mySqrt(8));
    }
}
