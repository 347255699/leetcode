package org.menfre;

import java.util.HashMap;
import java.util.Map;

/**
 * 单词规律
 *
 * @author menfre
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        Map<Character, Integer> map = new HashMap<>(pattern.length(), 1F);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                map.put(pattern.charAt(i), i);
            }
            sb.append(map.get(pattern.charAt(i)));
        }

        String[] words = s.split(" ");
        StringBuilder sb2 = new StringBuilder();
        Map<String, Integer> map2 = new HashMap<>(words.length, 1F);
        for (int i = 0; i < words.length; i++) {
            if (!map2.containsKey(words[i])) {
                map2.put(words[i], i);
            }
            sb2.append(map2.get(words[i]));
        }

        return sb.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {

    }
}
