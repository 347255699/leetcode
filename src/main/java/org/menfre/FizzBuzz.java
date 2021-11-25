package org.menfre;

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 *
 * @author menfre
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>(n - 1);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr.add("FizzBuzz");
            } else if (i % 3 == 0) {
                arr.add("Fizz");
            } else if (i % 5 == 0) {
                arr.add("Buzz");
            } else {
                arr.add("" + i);
            }
        }
        return arr;
    }
}
