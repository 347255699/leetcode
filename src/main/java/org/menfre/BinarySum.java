package org.menfre;

/**
 * 二进制求和
 *
 * @author menfre
 */
public class BinarySum {

    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = b;
            b = a;
            a = temp;
        }

        int c = a.length() - b.length();
        // 进位
        int d = 0;
        for (int i = 0; i < a.length(); i++) {

        }
//        b.length() - a.length()
//        char[] sum = new char[len];
//        // 进位
//        int j = 0;
//        for (int i = len - 1; i >= 0; i--) {
//
//        }
        return null;
    }

    public static void main(String[] args) {

    }
}
