package org.menfre;


import java.util.*;

/**
 * 罗马数字转整数
 * @author menfre
 */
public class RomanToInt {
    public int romanToInt(String s) {
        String[] romans = {
                "I",
                "V",
                "X",
                "L",
                "C",
                "D",
                "M",
                "IV",
                "IX",
                "XL",
                "XC",
                "CD",
                "CM"
        };
        int[] numbers = {
                1,
                5,
                10,
                50,
                100,
                500,
                1000,
                4,
                9,
                40,
                90,
                400,
                900
        };
        Map<String, Integer> relations = new HashMap<>(romans.length);
        for (int i = 0; i < romans.length; i++) {
            relations.put(romans[i], numbers[i]);
        }
        int result = 0;
        // 词法分析
        Stack<String> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            String romanWord = String.valueOf(c);
            if(stack.isEmpty()){
                stack.push(romanWord);
            }else{
                String doubleRomanWord = stack.peek() + romanWord;
                if (relations.containsKey(doubleRomanWord)) {
                    stack.pop();
                    stack.push(doubleRomanWord);
                }else{
                    stack.push(romanWord);
                }
            }
        }

        for (String romanWord : stack) {
            result += relations.get(romanWord);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInt().romanToInt("III"));
    }
}
