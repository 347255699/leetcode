package org.menfre;

import java.util.Arrays;

/**
 * 数组拆分 I
 * @author menfre
 */
public class ArrayPairSum {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) % 2 == 0) {
                sum += Math.min(nums[i], nums[i - 1]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 4, 3, 2};
        int[] nums = {6,2,6,5,1,2};
        System.out.println(new ArrayPairSum().arrayPairSum(nums));
    }
}
