package org.menfre;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 反转字符串中的元音字母
 *
 * @author menfre
 */
public class ReverseVowels {

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int p = 0, q = chars.length - 1;
        for (;p < chars.length; p++) {
            if(set.contains(chars[p])){
                while (q > p) {
                    if(set.contains(chars[q])){
                        char temp = chars[q];
                        chars[q] = chars[p];
                        chars[p] = temp;
                        q--;
                        break;
                    }
                    q--;
                }
                if(q <= p){
                    break;
                }
            }
        }
        return String.copyValueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseVowels().reverseVowels("leetcode"));
    }
}
