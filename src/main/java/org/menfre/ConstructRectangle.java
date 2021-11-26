package org.menfre;

import java.util.Arrays;

/**
 * 构造矩形
 *
 * @author menfre
 */
public class ConstructRectangle {

    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            --w;
        }
        return new int[]{area / w, w};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ConstructRectangle().constructRectangle(37)));
    }
}
