package org.menfre;

/**
 * 至少是其他数字两倍的最大数
 *
 * @author menfre
 */
public class DominantIndex {
    public int dominantIndex(int[] nums) {
        int p = 0;
        int max = nums[0];
        int sceMax = -1;
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            if (n > max) {
                sceMax = max;
                max = n;
                p = i;
            } else {
                if (n > sceMax && n < max) {
                    sceMax = n;
                }
            }
        }
        return sceMax == -1 || sceMax * 2 <= max ? p : -1;
    }

    public static void main(String[] args) {
//        int[] nums = {3, 6, 1, 0};
//        int[] nums = {1};
        int[] nums = {1, 2, 3, 4};
        System.out.println(new DominantIndex().dominantIndex(nums));
    }
}
