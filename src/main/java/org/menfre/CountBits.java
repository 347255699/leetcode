package org.menfre;

import java.util.Arrays;

/**
 * 比特位计数
 * @author menfre
 */
public class CountBits {

    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        int hightBit = 0;
        for (int i = 1; i <= n; i++) {
            if((i & i - 1) == 0){
                hightBit = i;
            }
            bits[i] = bits[i - hightBit] + 1;
        }
        return bits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountBits().countBits(2)));
    }
}
