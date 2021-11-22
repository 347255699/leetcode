package org.menfre;

/**
 * Excel 表列名称
 *
 * @author menfre
 */
public class ConvertToTitle {

    public String convertToTitle(int columnNumber) {
        int code = 'A' - 1;
        if (columnNumber <= 26) {
            return "" + (char) (columnNumber + code);
        }
        // 商
        int p = columnNumber / 26;
        // 余数
        int q = columnNumber % 26;
        if(q == 0){
            p = p - 1;
            q = 26;
        }

        return convertToTitle(p) + (char) (q + code);
    }

    public static void main(String[] args) {
        System.out.println(new ConvertToTitle().convertToTitle(701));
    }
}
