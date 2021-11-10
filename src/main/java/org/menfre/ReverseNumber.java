package org.menfre;

/**
 * @author menfre
 */
public class ReverseNumber {
    public int reverse(int x) {
        int reverse = 0;
        int min = Integer.MIN_VALUE / 10;
        int max = Integer.MAX_VALUE / 10;
        int minTail = Integer.MIN_VALUE % 10;
        int maxTail = Integer.MAX_VALUE % 10;
        while (x != 0) {
            if (reverse < min || reverse > max) {
                return 0;
            }
            int i = x % 10;
            if (reverse == min || reverse == max) {
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
        System.out.println(new ReverseNumber().reverse(12345));
    }
}
