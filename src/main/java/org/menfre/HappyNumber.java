package org.menfre;

import java.util.HashSet;
import java.util.Set;

/**
 * 快乐数
 *
 * @author menfre
 */
public class HappyNumber {

    public boolean isHappy(int n){
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)){
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    private int getNext(int n){
        int totalNum = 0;
        while(n != 0){
            int d = n % 10;
            n /= 10;
            totalNum += d * d;
        }
        return totalNum;
    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(19));
    }
}
