package org.menfre;

/**
 * 子数组最大平均数 I
 *
 * @author menfre
 */
public class FindMaxAverage {

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double max = sum;
        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i] - nums[i - k];
            max = Math.max(sum, max);
        }
        return max / k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 4, 0, 3, 2};
        System.out.println(new FindMaxAverage().findMaxAverage(nums, 1));
    }
}
