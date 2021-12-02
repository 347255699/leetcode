package org.menfre;

/**
 * 图片平滑器
 *
 * @author menfre
 */
public class ImageSmoother {

    public int[][] imageSmoother(int[][] img) {
        int[][] newImage = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                newImage[i][j] = getAverageGray(i, j, img);
            }
        }
        return newImage;
    }

    private int getAverageGray(int n, int m, int[][] img) {
        int k = 0;
        int sum = 0;
        for (int i = n - 1; i <= n + 1; i++) {
            for (int j = m - 1; j <= m + 1; j++) {
                if (i >= 0 && i < img.length) {
                    if (j >= 0 && j < img[i].length) {
                        sum += img[i][j];
                        k++;
                    }
                }
            }
        }
        return sum / k;
    }

    public static void main(String[] args) {
        int[][] nums = {{100, 200, 100}, {200, 50, 200}, {100, 200, 100}};
        new ImageSmoother().imageSmoother(nums);
    }
}
