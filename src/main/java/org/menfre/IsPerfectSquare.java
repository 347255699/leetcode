package org.menfre;

/**
 * 有效的完全平方数
 *
 * @author menfre
 */
public class IsPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int low = 1;
        int hight = num;
        while (low <= hight) {
            int mid = low + (hight - low) / 2;
            long product = (long) mid * (long) mid;
            if (product == num) {
                return true;
            } else if (product > num) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new IsPerfectSquare().isPerfectSquare(104976));
    }
}
