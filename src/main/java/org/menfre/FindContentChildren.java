package org.menfre;

import java.util.Arrays;

/**
 * 分发饼干
 *
 * @author menfre
 */
public class FindContentChildren {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int q = 0;
        int sum = 0;
        for (int i : g) {
            while (q < s.length) {
                if (s[q++] >= i) {
                    sum++;
                    break;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new FindContentChildren().findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }
}
