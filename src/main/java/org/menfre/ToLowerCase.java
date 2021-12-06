package org.menfre;

/**
 * 转换为小写字母
 *
 * @author menfre
 */
public class ToLowerCase {

    public String toLowerCase(String s) {
        int codePoint = 'a' - 'A';
        int startCode = 'A';
        int endCode = 'Z';
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= startCode && c <= endCode) {
                sb.append((char) (c + codePoint));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ToLowerCase().toLowerCase("Hello"));
    }
}
