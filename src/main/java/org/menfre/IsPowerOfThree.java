package org.menfre;

/**
 * 3的幂
 *
 * @author menfre
 */
public class IsPowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 9 == 0) {
                n /= 9;
            } else if (n % 3 == 0) {
                n /= 3;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsPowerOfThree().isPowerOfThree(6));
    }
}
