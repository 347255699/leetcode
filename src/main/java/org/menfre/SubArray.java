package org.menfre;

/**
 * @author menfre
 */
public class SubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int result = nums[0];
        for (int num : nums) {
            if(sum > 0){
                sum += num;
            }else{
                sum = num;
            }
            result = Math.max(sum, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new SubArray().maxSubArray(nums));
    }
}
