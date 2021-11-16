package org.menfre;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * @author menfre
 */
public class TwoNumberSum2 {
    private int[] twoSum(int[] numbers, int target) {
        // 利用哈希表将查询效率控制在 n*log(n)
        Map<Integer, Integer> heap = new HashMap<>(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            heap.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int j;
            int k = numbers[i];
            int t = target - k;
            if(heap.containsKey(t) && (j = heap.get(t)) != i){
                return new int[]{i + 1, j + 1};
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
        System.out.println(Arrays.toString(new TwoNumberSum2().twoSum(nums, target)));
    }
}
