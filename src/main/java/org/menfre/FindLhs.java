package org.menfre;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长和谐子序列
 *
 * @author menfre
 */
public class FindLhs {

    public int findlhS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;
        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                ans = Math.max(ans, map.get(num) + map.get(num + 1));
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
