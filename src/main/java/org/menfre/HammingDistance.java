package org.menfre;

/**
 *
 * @author menfre
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int f = x ^ y;
        return Integer.bitCount(f);
    }

    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(3, 1));
    }
}
