package org.menfre;

/**
 * 最长连续递增序列
 *
 * @author menfre
 */
public class FindLengthOfLcis {

    public int findLengthOfLcis(int[] nums) {
        int l = 0;
        int r = 0;
        int max = 1;
        for (int i = 0; i < nums.length; ) {
            int q = i + 1;
            for (; q < nums.length; q++) {
                if (nums[q] > nums[q - 1]) {
                    r = q;
                } else {
                    max = Math.max(max, r - l + 1);
                    i = q;
                    l = q;
                }
            }
            if (q == nums.length) {
                max = Math.max(max, r - l + 1);
                break;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new FindLengthOfLcis().findLengthOfLcis(new int[]{1, 3, 5, 7}));
    }
}
