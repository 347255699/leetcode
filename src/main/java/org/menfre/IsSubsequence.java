package org.menfre;

/**
 * 判断子序列
 * @author menfre
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if(j == t.length()){
                return false;
            }
            while (j < t.length()){
                if(s.charAt(i) == t.charAt(j++)){
                    break;
                }
            }
            if(j == t.length() && s.charAt(i) != t.charAt(j - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("abc", ""));
    }
}
