package org.menfre;

/**
 * 字符串中的单词数
 * @author menfre
 */
public class CountSegments {

    public int countSegments(String s) {
        int words = 0;
        int p = 0;
        while (p < s.length()) {
            if(s.charAt(p) != ' '){
                int q = p + 1;
                for (; q < s.length(); q++) {
                    if (s.charAt(q) == ' ') {
                        words++;
                        break;
                    }
                }
                if(q == s.length()){
                    break;
                }
                p = q + 1;
            }else{
                p++;
            }
        }
        if(s.length() > 0 && s.charAt(s.length() - 1) != ' '){
            words++;
        }
        return words;
    }

    public static void main(String[] args) {
        System.out.println(new CountSegments().countSegments("Hello, my name is John"));
    }
}
