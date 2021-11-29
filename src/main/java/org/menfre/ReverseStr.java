package org.menfre;

/**
 * 反转字符串 II
 *
 * @author menfre
 */
public class ReverseStr {

    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        // 2k
        int k2 = 2 * k;
        for (int i = 0; i < s.length(); i++) {
            // length % 2k == 0
            if ((i + 1) % k2 == 0) {
                reverse(sb, s, i + 1 - k2, i - k);
                sb.append(s, i + 1 - k, i + 1);
            }
        }

        int remain = s.length() - sb.length();
        if (remain > 0) {
            if(remain < k){
                reverse(sb, s, sb.length(), s.length() - 1);
            }else{
                reverse(sb, s, sb.length(), sb.length() + k - 1);
                sb.append(s, sb.length(), s.length());
            }
        }
        return sb.toString();
    }

    private void reverse(StringBuilder sb, String s, int start, int end) {
        for (int j = end; j >= start; j--) {
            sb.append(s.charAt(j));
        }
    }

    public static void main(String[] args) {
        System.out.println(new ReverseStr().reverseStr("a", 2));
    }
}
