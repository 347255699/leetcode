package org.menfre;

/**
 * 验证回文字符串 Ⅱ
 *
 * @author menfre
 */
public class ValidPalindrome {

    public boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)){
                return validPalindrome(s, i, j - 1) || validPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    private boolean validPalindrome(String s, int n, int m){
        for(int i = n, j = m; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}
