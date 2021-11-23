package org.menfre;

import java.util.Arrays;

/**
 * 移动零
 * @author menfre
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        // 常用双指针法
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                p = Math.max(i + 1, p);
                for (; p < nums.length; p++) {
                    if(nums[p] != 0){
                        nums[i] = nums[p];
                        nums[p] = 0;
                        break;
                    }
                }
                if(p == nums.length){
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
