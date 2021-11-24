package org.menfre;

/**
 * 数字转换为十六进制数
 *
 * @author menfre
 */
public class ToHex {
    public String toHex(int num) {
        if(num == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int i = num & 15;
            char c = i > 9 ? (char) ('a' + (i - 10)) : (char) ('0' + i);
            sb.append(c);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new ToHex().toHex(26));
    }
}
