package org.menfre;

import java.util.HashMap;
import java.util.Map;

/**
 * 同构字符串
 *
 * @author menfre
 */
public class Isomorphic {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            }
            if (!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), i);
            }
            if (!map.get(s.charAt(i)).equals(map2.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Isomorphic().isIsomorphic("paper", "title"));
    }
}
