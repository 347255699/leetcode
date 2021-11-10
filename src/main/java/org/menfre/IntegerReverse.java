package org.menfre;

/**
 * 整数反转
 * @author menfre
 */
public class IntegerReverse {
    public int reverse(int x) {
        int reverse = 0;
        // Integer 最大和最小值除个位数外的前 n - 1 位值
        int min = Integer.MIN_VALUE / 10;
        int max = Integer.MAX_VALUE / 10;
        // Integer 最大和最小值个位数数值
        int minTail = Integer.MIN_VALUE % 10;
        int maxTail = Integer.MAX_VALUE % 10;
        while (x != 0) {
            // 前 n - 1 位数值 < min/> max 反转值大于极限值
            if (reverse < min || reverse > max) {
                return 0;
            }
            int i = x % 10;
            // 若前 n - 1 位值相等，则继续判断个位数
            if (reverse == min || reverse == max) {
                // 个位数 < minTail/> maxTail 反转值大于极限值
                if (i < minTail || i > maxTail) {
                    return 0;
                }
            }
            reverse = reverse * 10 + i;
            x /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(new IntegerReverse().reverse(12345));
    }
}
