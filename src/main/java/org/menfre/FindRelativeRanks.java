package org.menfre;

import java.util.*;

/**
 * 相对名次
 *
 * @author menfre
 */
public class FindRelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        int[] origin = Arrays.copyOf(score, score.length);
        Arrays.sort(score);
        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        Map<Integer, String> map = new HashMap<>();
        for (int i = score.length - 1; i >= 0; i--) {
            int j = (score.length - 1) - i;
            if (j < 3) {
                map.put(score[i], medals[j]);
            } else {
                map.put(score[i], String.valueOf(j + 1));
            }
        }

        String[] strs = new String[score.length];
        for (int i = 0; i < origin.length; i++) {
            strs[i] = map.get(origin[i]);
        }
        return strs;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(new FindRelativeRanks().findRelativeRanks(nums)));
    }
}
