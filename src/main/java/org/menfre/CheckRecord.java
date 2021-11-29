package org.menfre;

/**
 * 学生出勤记录 I
 *
 * @author menfre
 */
public class CheckRecord {

    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                l++;
                if (l >= 3) {
                    return false;
                }
            } else {
                l = 0;
            }
            if (s.charAt(i) == 'A') {
                a++;
                if (a >= 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new CheckRecord().checkRecord("PPALLL"));
    }
}
