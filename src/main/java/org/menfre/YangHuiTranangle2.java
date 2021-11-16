package org.menfre;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角1
 * @author menfre
 */
public class YangHuiTranangle2 {

    public List<Integer> generate(int rowIndex) {
        int numRows = rowIndex + 1;
        final List<List<Integer>> rows = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> subRows = new ArrayList<>(i + 1);
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    subRows.add(j, 1);
                }else{
                    List<Integer> lastLow = rows.get(i - 1);
                    subRows.add(j, lastLow.get(j) + lastLow.get(j - 1));
                }
            }
            rows.add(subRows);
        }
        return rows.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(new YangHuiTranangle2().generate(5));
    }
}
