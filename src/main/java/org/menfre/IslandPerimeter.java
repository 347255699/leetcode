package org.menfre;

/**
 * 岛屿的周长
 *
 * @author menfre
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    sum += getPerimeter(i, j, grid);
                }
            }
        }
        return sum;
    }

    private int getPerimeter(int i, int j, int[][] grid) {
        int sum = 0;
        if (i - 1 < 0 || grid[i - 1][j] == 0) {
            sum++;
        }
        if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
            sum++;
        }
        if (j - 1 < 0 || grid[i][j - 1] == 0) {
            sum++;
        }
        if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
//        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
//        int[][] grid = {{1}};
        int[][] grid = {{1, 1}};
        System.out.println(new IslandPerimeter().islandPerimeter(grid));
    }
}
