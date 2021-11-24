package org.menfre;

/**
 * 猜数字大小
 *
 * @author menfre
 */
public class GuessNumber {

    private final int num;

    public GuessNumber(int num) {
        this.num = num;
    }

    private int guess(int num) {
        return Integer.compare(this.num, num);
    }

    public int guessNumber(int n) {
        int low = 1;
        int hight = n;
        while (low <= hight) {
            int mid = low + (hight - low) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                low = mid + 1;
            } else {
                hight = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new GuessNumber(6).guessNumber(10));
    }
}
