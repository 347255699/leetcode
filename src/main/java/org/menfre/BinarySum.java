package org.menfre;

/**
 * 二进制求和
 *
 * @author menfre
 */
public class BinarySum {

    public String addBinary(String a, String b) {
        int len = Math.max(a.length(), b.length());
        int carry = 0;
        StringBuilder result = new StringBuilder(len + 1);
        for (int i = 0; i < len; i++) {
            int c = a.length() - i - 1 >= 0 ? a.charAt(a.length() - i - 1) - '0':0;
            int d = b.length() - i - 1 >= 0 ? b.charAt(b.length() - i - 1) - '0':0;
            int sum = c + d + carry;
            result.append(sum % 2 == 0 ? '0' : '1');
            carry = sum / 2;
        }
        if(carry > 0){
            result.append('1');
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String result = new BinarySum().addBinary("1010", "1011");
        System.out.println(result);
    }
}
