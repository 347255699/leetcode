package org.menfre;

/**
 * 密钥格式化
 *
 * @author menfre
 */
public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "");
        int len = s.length();
        StringBuilder sb = new StringBuilder(s.length());
        if (len == 0) {
            return sb.toString();
        }

        int j = len % k;
        if (j != 0) {
            sb.append(s, 0, j);
            if (j < len) {
                sb.append("-");
            }
        }

        while (j < len) {
            sb.append(s, j, j + k);
            j += k;
            if (j < len) {
                sb.append("-");
            }
        }
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(new LicenseKeyFormatting().licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }
}
