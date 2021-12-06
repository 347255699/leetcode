package org.menfre;

/**
 * 1比特与2比特字符
 *
 * @author menfre
 */
public class IsOneBitCharacter {

    public boolean isOneBitCharacter(int[] bits) {
        int i = bits.length - 2;
        while(i >= 0 && bits[i] > 0){
            i--;
        }
        return (bits.length - i) % 2 == 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 0};
        System.out.println(new IsOneBitCharacter().isOneBitCharacter(nums));
    }
}
