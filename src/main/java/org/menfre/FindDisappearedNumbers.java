package org.menfre;

import java.util.*;

/**
 * 找到所有数组中消失的数字
 *
 * @author menfre
 */
public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }


        List<Integer> arr = new ArrayList<>();
        for (int p = 0; p < nums.length; p++) {
            int i = p + 1;
            if (nums[p] != i && !set.contains(i)) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(new FindDisappearedNumbers().findDisappearedNumbers(new int[]{10, 2, 5, 10, 9, 1, 1, 4, 3, 7}));
    }
}
