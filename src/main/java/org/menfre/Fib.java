package org.menfre;

/**
 * 斐波那契数
 *
 * @author menfre
 */
public class Fib {

    public int fib(int n) {
        int[] fibs = new int[n + 1];
        if(n > 1) {
            fibs[0] = 0;
            fibs[1] = 1;

            for (int i = 2; i <= n; i++) {
                fibs[i] = fibs[i - 1] + fibs[i - 2];
            }
            return fibs[n - 1] + fibs[n - 2];
        }else{
            return n;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Fib().fib(3));
    }
}
