package org.menfre;

import java.util.Arrays;

/**
 * 第三大的数
 *
 * @author menfre
 */
public class ThirdMax {

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int thirdMax = nums[len - 1];
        int j = 0;
        for (int i = len - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                thirdMax = nums[i - 1];
                if (++j == 2) {
                    break;
                }
            }
        }
        return j == 2 ? thirdMax : nums[len - 1];
    }

    public static void main(String[] args) {
        System.out.println(new ThirdMax().thirdMax(new int[]{2, 2, 3, 1}));
    }
}
