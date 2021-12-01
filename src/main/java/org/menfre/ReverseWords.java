package org.menfre;

/**
 * 反转字符串中的单词 III
 *
 * @author menfre
 */
public class ReverseWords {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                for (int j = i - 1; j >= k; j--) {
                    sb.append(s.charAt(j));
                }
                sb.append(s.charAt(i));
                k = i + 1;
            }
            if (i == s.length() - 1) {
                for (int j = i; j >= k; j--) {
                    sb.append(s.charAt(j));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWords().reverseWords("Let's take LeetCode contest"));
    }
}
