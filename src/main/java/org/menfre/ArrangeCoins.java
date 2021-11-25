package org.menfre;

/**
 * 排列硬币
 * @author menfre
 */
public class ArrangeCoins {

    public int arrangeCoins(int n) {
        if(n == 1){
            return n;
        }

        int sum = 0;
        int i = 1;
        for (; i <= n; i++) {
            sum += i;
            if (n - sum < 0) {
                return i - 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(new ArrangeCoins().arrangeCoins(1));
    }
}
