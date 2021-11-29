package org.menfre;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 *
 * @author menfre
 */
public class RomanToInt {
    public int romanToInt(String s) {
        char[] romans = {
                'I',
                'V',
                'X',
                'L',
                'C',
                'D',
                'M',
        };
        int[] numbers = {
                1,
                5,
                10,
                50,
                100,
                500,
                1000
        };
        Map<Character, Integer> relations = new HashMap<>(romans.length);
        for (int i = 0; i < romans.length; i++) {
            relations.put(romans[i], numbers[i]);
        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i != s.length() - 1 && relations.get(c) < relations.get(s.charAt(i + 1))) {
                result -= relations.get(c);
            } else {
                result += relations.get(c);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInt().romanToInt("IV"));
    }
}
