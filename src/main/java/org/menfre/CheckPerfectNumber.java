package org.menfre;

/**
 * 完美数
 * @author menfre
 */
public class CheckPerfectNumber {

    public boolean checkPerfectNumber(int num) {
        if(num == 1){
            return false;
        }
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                sum += i;
                if(i != 1){
                    sum += num / i;
                }
            }
            if(sum > num){
                return false;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(new CheckPerfectNumber().checkPerfectNumber(28));
    }
}
