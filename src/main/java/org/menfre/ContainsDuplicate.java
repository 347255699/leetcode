package org.menfre;

import sun.nio.cs.FastCharsetProvider;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复元素
 *
 * @author menfre
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
