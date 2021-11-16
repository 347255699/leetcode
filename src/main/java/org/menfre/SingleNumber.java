package org.menfre;

/**
 * 只出现一次的数字
 * @author menfre
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(new SingleNumber().singleNumber(nums));
    }
}
