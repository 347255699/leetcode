package org.menfre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 汇总区间
 *
 * @author menfre
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        final List<String> arr = new ArrayList<>();
        int p = 0;
        while (p < nums.length) {
            int q = p + 1;
            for (; q < nums.length; q++) {
                if ((long)nums[q] - (long)nums[p] > q - p) {
                    arr.add(p == q - 1 ? "" + nums[p] : String.format("%d->%d", nums[p], nums[q - 1]));
                    break;
                }
            }
            if (q == nums.length) {
                arr.add(p == q - 1 ? "" + nums[p] : String.format("%d->%d", nums[p], nums[q - 1]));
            }
            p = Math.max(p + 1, q);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {-2147483648,-2147483647,2147483647};
        System.out.println(Arrays.toString(new SummaryRanges().summaryRanges(nums).toArray()));
    }
}
