package org.menfre;

import java.util.*;

/**
 * 两个数组的交集2
 *
 * @author menfre
 */
public class Intersection2 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(nums1.length, 1F);
        for (int i : nums1) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int[] nums = new int[Math.max(nums1.length, nums2.length)];
        int j = 0;
        for (int i : nums2) {
            if (map.containsKey(i)) {
                if (map.get(i) > 0) {
                    nums[j++] = i;
                    map.replace(i, map.get(i) - 1);
                }
            }
        }

        int[] result = new int[j];
        System.arraycopy(nums, 0, result, 0, j);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Intersection2().intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }
}
