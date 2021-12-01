package org.menfre;

import javax.lang.model.element.VariableElement;
import java.util.Arrays;

/**
 * 重塑矩阵
 *
 * @author menfre
 */
public class MatrixReshape {

    private int p = 0;
    private int q = 0;

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int[][] nums = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                nums[i][j] = getNumber(mat);
            }
        }
        return nums;
    }

    private int getNumber(int[][] mat) {
        int num = mat[p][q];
        q++;
        if (q >= mat[p].length) {
            p++;
            q = 0;
        }
        return num;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}};
        int[][] ints = new MatrixReshape().matrixReshape(nums, 2, 4);
        System.out.println(Arrays.toString(ints));
    }
}
