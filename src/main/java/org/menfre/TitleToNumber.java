package org.menfre;

/**
 * Excel 表列名称
 *
 * @author menfre
 */
public class TitleToNumber {

    public int titleToNumber(String columnTitle) {
        int num = 0;
        int code = 'A' - 1;
        for (int i = 0; i < columnTitle.length(); i++) {
            num = num * 26 + (columnTitle.charAt(i) - code);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new TitleToNumber().titleToNumber("ZY"));
    }
}
