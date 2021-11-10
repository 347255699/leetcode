package org.menfre;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * @author menfre
 */
public class TwoNumberSum {
    private int[] twoSum(int[] nums, int target) {
        // 利用哈希表将查询效率控制在 n*log(n)
        Map<Integer, Integer> heap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            heap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int j;
            int k = nums[i];
            int t = target - k;
            if(heap.containsKey(t) && (j = heap.get(t)) != i){
                return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
//        int[] nums = {3, 2, 4};
//        int target = 6;
//        int[] nums = {3, 3};
//        int target = 6;
        System.out.println(Arrays.toString(new TwoNumberSum().twoSum(nums, target)));
    }
}
