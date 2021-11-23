package org.menfre;

/**
 * 4的幂
 *
 * @author menfre
 */
public class IsPowerOfFour {

    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 16 == 0) {
                n /= 16;
            } else if (n % 4 == 0) {
                n /= 4;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsPowerOfFour().isPowerOfThree(16));
    }
}
