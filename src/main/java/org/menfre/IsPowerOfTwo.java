package org.menfre;

/**
 * 2 次幂
 * @author menfre
 */
public class IsPowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        while (n > 1){
            if (n % 4 == 0) {
                n /= 4;
            }else if(n % 2 == 0){
                n /= 2;
            }else {
                return false;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(new IsPowerOfTwo().isPowerOfTwo(5));
    }
}
