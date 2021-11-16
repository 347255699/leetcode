package org.menfre;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角1
 * @author menfre
 */
public class YangHuiTranangle {

    public List<List<Integer>> generate(int numRows) {
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
        return rows;
    }

    public static void main(String[] args) {
        System.out.println(new YangHuiTranangle().generate(5));
    }
}
