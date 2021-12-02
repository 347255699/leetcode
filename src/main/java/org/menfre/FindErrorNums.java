package org.menfre;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 错误的集合
 *
 * @author menfre
 */
public class FindErrorNums {

    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int err = -1;
        for (int num : nums) {
            if (set.contains(num)) {
                err = num;
            }
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return new int[]{err, i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 1};
        System.out.println(Arrays.toString(new FindErrorNums().findErrorNums(nums)));
    }
}
