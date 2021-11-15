package org.menfre;

import java.util.Arrays;

/**
 * 合并两个有序数组
 * @author menfre
 */
public class MergeToAscArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m + n];
        int p = 0, q = 0;
        while (p < m || q < n) {
            int r;
            if(p == m){
                r = nums2[q++];
            }
            else if(q == n){
                r = nums1[p++];
            }
            else if (nums1[p] < nums2[q]) {
                r = nums1[p++];
            } else {
                r = nums2[q++];
            }
            sorted[p + q - 1] = r;
        }
        System.arraycopy(sorted, 0, nums1, 0, sorted.length);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        new MergeToAscArray().merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
