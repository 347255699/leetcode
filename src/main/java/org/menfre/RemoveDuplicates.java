package org.menfre;

/**
 * @author menfre
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        int q = 1;
        for(; p < nums.length; p++){
            for(; q < nums.length; q++){
                if(nums[p] != nums[q]){
                    nums[p + 1] = nums[q];
                    break;
                }
            }
            if(q >= nums.length){
                break;
            }
        }
        return p + 1;
    }

    public static void main(String[] args) {
        int[] ints = {1, 1, 2};
//        int[] ints = {0,0,1,1,1,2,2,3,3,4};
        int len = new RemoveDuplicates().removeDuplicates(ints);
        for (int i = 0; i < len; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
