package org.menfre;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数
 *
 * @author menfre
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr = new ArrayList<>(right - left);
        for (int i = left; i <= right; i++) {
            int num = i;
            while (num != 0) {
                int j = num % 10;
                if (j == 0 || i % j != 0) {
                    break;
                }
                num = num / 10;
            }
            if (num == 0) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(new SelfDividingNumbers().selfDividingNumbers(1, 22));
    }
}
