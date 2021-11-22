package org.menfre;

import java.util.Arrays;

/**
 * @author menfre
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int p = 1; p < nums.length; p++) {
            if (nums[p] - nums[p - 1] > 1) {
                return nums[p - 1] + 1;
            }
        }
        if (nums.length > 1) {
            return nums[0] != 0 ? 0 : nums.length;
        } else {
            return nums[0] == 0 ? 1 : 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{1,2}));
    }
}
