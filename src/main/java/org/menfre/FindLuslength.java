package org.menfre;

/**
 * 最长特殊序列 Ⅰ
 *
 * @author menfre
 */
public class FindLuslength {

    public int findLuslength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {

    }
}
