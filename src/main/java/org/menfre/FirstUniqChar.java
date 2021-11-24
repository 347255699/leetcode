package org.menfre;

import java.util.HashSet;
import java.util.Set;

/**
 * 字符串中的第一个唯一字符
 * @author menfre
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int j = i + 1;
            if (set.contains(s.charAt(i))) {
                continue;
            }
            for (; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    set.add(s.charAt(j));
                    break;
                }
            }
            if(j == s.length()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstUniqChar().firstUniqChar("aabb"));
    }
}
