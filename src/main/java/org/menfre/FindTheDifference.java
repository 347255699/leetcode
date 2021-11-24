package org.menfre;

import java.util.HashMap;
import java.util.Map;

/**
 * 找不同
 *
 * @author menfre
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>(s.length(), 1F);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        char c = 0;
        for (int i = 0; i < t.length(); i++) {
            c = t.charAt(i);
            if (!map.containsKey(c) || map.get(c) <= 0) {
                return c;
            } else {
                map.replace(c, map.get(c) - 1);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new FindTheDifference().findTheDifference("a", "aa"));
    }
}
