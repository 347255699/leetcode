package org.menfre;

/**
 * @author menfre
 */
public class Palindrome {
    public boolean isPalindrome(int x){
        return x >= 0 && reverse(x) == x;
    }

    private int reverse(int x) {
        int rever = 0;
        while (x != 0) {
            int i = x % 10;
            rever = rever * 10 + i;
            x /= 10;
        }
        return rever;
    }

    public static void main(String[] args) {
        int x = 0;
        System.out.println(new Palindrome().isPalindrome(x));
    }
}
