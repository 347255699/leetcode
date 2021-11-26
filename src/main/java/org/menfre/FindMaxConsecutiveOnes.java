package org.menfre;

/**
 * 最大连续 1 的个数
 *
 * @author menfre
 */
public class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int p = 0, max = 0;
        int j = 0;
        for (; p < nums.length; p++) {
            if (nums[p] != 0) {
                j++;
            }else{
                max = Math.max(max, j);
                j = 0;
            }
        }
        return Math.max(max, j);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,1,1,1};
        System.out.println(new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(nums));
    }
}
