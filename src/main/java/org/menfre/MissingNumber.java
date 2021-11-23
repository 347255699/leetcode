package org.menfre;

import java.util.Arrays;

/**
 * @author menfre
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        // 1 <= nums.length <= 10^4
        if (nums.length == 1) {
            return nums[0] == 0 ? 1 : 0;
        }
        Arrays.sort(nums);
        for (int p = 1; p < nums.length; p++) {
            // 产生不连续的数，nums[p - 1] + 1 即为丢失的数
            if (nums[p] - nums[p - 1] > 1) {
                return nums[p - 1] + 1;
            }
        }
        // 结束遍历，只剩下 0 和 nums.length，判断丢失的是哪一个
        return nums[0] != 0 ? 0 : nums.length;
    }

    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{1, 2}));
    }
}
