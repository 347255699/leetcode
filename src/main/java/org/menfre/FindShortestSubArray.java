package org.menfre;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组的度
 *
 * @author menfre
 */
public class FindShortestSubArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer[] item = map.getOrDefault(num, new Integer[]{0, -1, -1});
            item[0] = item[0] + 1;
            if (item[1] == -1) {
                item[1] = i;
            }
            item[2] = i;
            map.put(num, item);
        }

        int num = -1;
        for (Integer key : map.keySet()) {
            if (num == -1) {
                num = key;
            } else {
                Integer[] item = map.get(num);
                Integer[] item2 = map.get(key);
                if (item2[0] > item[0]) {
                    num = key;
                }
                if (item2[0].equals(item[0])) {
                    if (item2[2] - item2[1] < item[2] - item[1]) {
                        num = key;
                    }
                }
            }
        }
        return map.get(num)[2] - map.get(num)[1] + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(new FindShortestSubArray().findShortestSubArray(nums));
    }
}
