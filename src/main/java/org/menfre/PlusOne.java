package org.menfre;

/**
 * @author menfre
 */
public class PlusOne {

    public int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 < 10) {
                digits[i] = digits[i] + 1;
                break;
            }else{
                digits[i] = 0;
            }
        }
        if(digits[0] == 0){
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        for (int i : new PlusOne().plusOne(nums)) {
            System.out.print(i + " ");
        }
    }
}
