package org.menfre;

import java.util.Arrays;

/**
 * 轮转数组
 *
 * @author menfre
 */
public class Rotate {
    public void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, (k % nums.length) - 1);
        reverse(nums, k % nums.length, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        for (int i = left, j = right; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        new Rotate().rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
