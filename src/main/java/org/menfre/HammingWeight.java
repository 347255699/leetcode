package org.menfre;

/**
 * 位 1 的个数
 * @author menfre
 */
public class HammingWeight {

    public int hammingWeight(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            rev += n & 1;
            n >>>= 1;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(new HammingWeight().hammingWeight(3));
    }
}
