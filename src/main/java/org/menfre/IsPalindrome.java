package org.menfre;

/**
 * 验证回文串
 *
 * @author menfre
 */
public class IsPalindrome {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);
            if(word >= '0' && word <= '9'){
                sb.append(word);
            }
            if(word >= 'a' && word <= 'z'){
                sb.append(word);
            }
            if(word >= 'A' && word <= 'Z'){
                sb.append(word);
            }
        }
        return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
