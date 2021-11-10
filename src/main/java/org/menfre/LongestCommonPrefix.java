package org.menfre;

/**
 * @author menfre
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String lcp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int len = Math.min(lcp.length(), strs[i].length());
            int index = 0;
            for (int j = 0; j < len; j++) {
                if(lcp.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                index++;
            }
            lcp = lcp.substring(0, index);
        }
        return lcp;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"dog","racecar","car"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
    }
}
