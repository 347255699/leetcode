package org.menfre;

import java.util.Arrays;

/**
 * 最小操作次数使数组元素相等
 *
 * @author menfre
 */
public class MinMoves {

    public int minMoves(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int sum = 0;
        for (int i : nums) {
            sum += i - min;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
