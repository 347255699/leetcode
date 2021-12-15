package org.menfre;

/**
 * 斐波那契数
 *
 * @author menfre
 */
public class Fib {

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int a, b = 1, r = 1;
        for (int i = 2; i <= n; i++) {
            a = b;
            b = r;
            r = a + b;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(new Fib().fib(3));
    }
}
