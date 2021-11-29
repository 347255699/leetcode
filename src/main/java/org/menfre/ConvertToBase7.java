package org.menfre;

/**
 * 七进制数
 *
 * @author menfre
 */
public class ConvertToBase7 {

    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        String symbol = num < 0 ? "-" : "";
        StringBuilder sb = new StringBuilder();
        while (num != 0){
            int i = num % 7;
            sb.append(Math.abs(i));
            num /= 7;
        }
        sb.append(symbol);
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(new ConvertToBase7().convertToBase7(-7));
    }
}
