package org.menfre;

/**
 * 字符串相加
 *
 * @author menfre
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        // 确定参照物
        if(num1.length() > num2.length()){
            String temp = num2;
            num2 = num1;
            num1 = temp;
        }

        int a = num2.length() - num1.length();
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = num2.length() - 1; i >= 0; i--){
            int sum;
            if(i - a < 0){
                sum = num2.charAt(i) - '0' + j;
            }else{
                sum = (num1.charAt(i - a) - '0') + (num2.charAt(i) - '0') + j;
            }

            if(sum > 9){
                j = sum / 10;
                sb.append((char)('0' + sum % 10));
            }else{
                j = 0;
                sb.append((char)('0' + sum));
            }
        }
        if(j > 0){
            sb.append(j);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddStrings().addStrings("456", "77"));
    }
}
