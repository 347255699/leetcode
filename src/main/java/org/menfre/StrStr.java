package org.menfre;

/**
 * @author menfre
 */
public class StrStr {

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)){
                if((haystack.length() - i) < needle.length()){
                    return -1;
                }
                int k = i;
                int j = 0;
                for (; j < needle.length(); k++, j++) {
                    if(haystack.charAt(k) != needle.charAt(j)){
                        break;
                    }
                }
                if (j == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new StrStr().strStr("hello", "ll"));
    }
}
