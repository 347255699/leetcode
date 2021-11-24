package org.menfre;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集
 *
 * @author menfre
 */
public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }

        int[] nums = new int[Math.min(nums1.length, nums2.length)];
        int j = 0;
        for (int i : nums2) {
            if (set.contains(i)) {
                nums[j++] = i;
                set.remove(i);
            }
        }

        int[] result = new int[j];
        System.arraycopy(nums, 0, result, 0, j);
        return result;
    }

    public static void main(String[] args) {

    }
}
