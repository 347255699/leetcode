package org.menfre;

/**
 * 交替位二进制数
 *
 * @author menfre
 */
public class HasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String binaryStr = Integer.toBinaryString(n);
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            if (i != 0 && binaryStr.charAt(i) == binaryStr.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(5));
    }
}
