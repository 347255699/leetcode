package org.menfre;

/**
 * 整数替换
 *
 * @author menfre
 */
public class IntegerReplacement {

    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + integerReplacement(n / 2);
        }
        return 1 + Math.min(integerReplacement(n - 1), integerReplacement(n + 1));
    }

    public static void main(String[] args) {
//        65535
        System.out.println(new IntegerReplacement().integerReplacement(11));
    }
}
