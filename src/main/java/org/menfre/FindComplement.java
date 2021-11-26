package org.menfre;

/**
 * 数字的补数
 *
 * @author menfre
 */
public class FindComplement {

    public int findComplement(int num) {
        String bits = Integer.toBinaryString(num);
        int sum = 0;
        for (int i = bits.length() - 1; i >= 0; i--) {
            int j = bits.charAt(i) - '0';
            j = j == 0 ? 1 : 0;
            if (j == 1) {
                int sum2 = 1;
                int k = bits.length() - i - 1;
                while (k > 0) {
                    sum2 *= 2;
                    k--;
                }
                sum += sum2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new FindComplement().findComplement(10));
    }
}
