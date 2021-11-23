package org.menfre;

/**
 * 第一个错误的版本
 *
 * @author menfre
 */
public class FirstBadVersion {

    private final int badVersion;

    public FirstBadVersion(int badVersion){
        this.badVersion = badVersion;
    }

    private boolean isBadVersion(int version){
        return version >= badVersion;
    }

    public int firstBadVersion(int n) {
        int low = 1;
        int hight = n;
        while (low <= hight){
            int mid = low + (hight - low) / 2;
            if (isBadVersion(mid)) {
                if(mid == 1 || !isBadVersion(mid - 1)){
                    return mid;
                }else{
                    hight = mid - 1;
                }
            }else{
                low = mid + 1;
            }
        }
        return hight;
    }

    public static void main(String[] args) {
        System.out.println(new FirstBadVersion(4).firstBadVersion(5));
    }
}
