package org.menfre;

/**
 * 重复的子字符串
 *
 * @author menfre
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }

    public static void main(String[] args) {
        System.out.println(new RepeatedSubstringPattern().repeatedSubstringPattern("abcabc"));
    }
}
