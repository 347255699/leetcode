package org.menfre;

import java.util.HashMap;
import java.util.Map;

/**
 * 有效的字母异位词
 *
 * @author menfre
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            char c2 = t.charAt(i);
            if (map2.containsKey(c2)) {
                map2.replace(c2, map2.get(c2) + 1);
            } else {
                map2.put(c2, 1);
            }
        }

        for (Character c : map.keySet()) {
            if (!map2.containsKey(c) || !map.get(c).equals(map2.get(c))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsAnagram().isAnagram("a", "ab"));
    }
}
