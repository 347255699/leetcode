package org.menfre;

import java.util.HashSet;
import java.util.Set;

/**
 * 分糖果
 *
 * @author menfre
 */
public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int j : candyType) {
            set.add(j);
            if (set.size() == candyType.length / 2) {
                break;
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
//        int[] nums = {1, 1, 2, 2, 3, 3};
//        int[] nums = {1,1,2,3};
        int[] nums = {6,6,6,6};
        System.out.println(new DistributeCandies().distributeCandies(nums));
    }
}
