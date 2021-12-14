package org.menfre;

/**
 * 寻找数组的中心下标
 *
 * @author menfre
 */
public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for (int p = 1; p < nums.length; p++) {
            right += nums[p];
        }

        for (int i = 0; i < nums.length; i++) {
            if(i > 0){
                left += nums[i - 1];
                right -= nums[i];
            }
            if(left == right){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
