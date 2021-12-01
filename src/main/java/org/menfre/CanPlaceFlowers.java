package org.menfre;

/**
 * 种花问题
 *
 * @author menfre
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1 && flowerbed[0] == 0){
            return n <= 1;
        }
        int j = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i != 0 && i != flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        j++;
                    }
                }
                if (i == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    j++;
                }
                if (i == flowerbed.length - 1 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    j++;
                }
            }
        }
        return j >= n;
    }

    public static void main(String[] args) {
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }
}
