package org.menfre;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author menfre
 */
public class ValidBrackets {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>(3);
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (brackets.containsKey(c)) {
                stack.push(c);
            }else{
                if (stack.isEmpty() || !brackets.get(stack.pop()).equals(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new ValidBrackets().isValid("()"));
    }
}
