package org.menfre;

import java.util.Arrays;

/**
 * 反转字符串
 * @author menfre
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int p = 0, q = s.length - 1;
        while (p < q){
            char temp = s[q];
            s[q] = s[p];
            s[p] = temp;
            p++;
            q--;
        }
    }

    public static void main(String[] args) {
        char[] s = new char[]{'H','a','n','n','a','h'};
        new ReverseString().reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
