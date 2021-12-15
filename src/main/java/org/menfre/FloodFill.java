package org.menfre;

/**
 * 图像渲染
 *
 * @author menfre
 */
public class FloodFill {

    private int origin;
    private int newColor;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.origin = image[sr][sc];
        this.newColor = newColor;
        dfs(image, sr, sc);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc){
        if(sr < 0 || sr > image.length - 1){
            return;
        }
        if(sc < 0 || sc > image[sr].length - 1){
            return;
        }
        if(image[sr][sc] != origin || image[sr][sc] == newColor){
            return;
        }
        // 符合条件改变颜色
        image[sr][sc] = newColor;
        dfs(image, sr + 1, sc);
        dfs(image, sr - 1, sc);
        dfs(image, sr, sc + 1);
        dfs(image, sr, sc - 1);
    }
}
