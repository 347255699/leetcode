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
            if (i != s.length() - 1) {
                char c2 = s.charAt(i + 1);
                i++;
                if (c == 'I' && (c2 == 'V' || c2 == 'X')) {
                    result += relations.get(c2) - relations.get(c);
                } else if (c == 'X' && (c2 == 'L' || c2 == 'C')) {
                    result += relations.get(c2) - relations.get(c);
                } else if (c == 'C' && (c2 == 'D' || c2 == 'M')) {
                    result += relations.get(c2) - relations.get(c);
                } else {
                    result += relations.get(c);
                    i--;
                }
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
