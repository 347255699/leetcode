package org.menfre;

import java.util.HashMap;
import java.util.Map;

/**
 * 赎金信
 *
 * @author menfre
 */
public class CanConstruct {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>(magazine.length(), 1F);
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) > 0) {
                    map.replace(c, map.get(c) - 1);
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new CanConstruct().canConstruct("aa", "aab"));
    }
}
