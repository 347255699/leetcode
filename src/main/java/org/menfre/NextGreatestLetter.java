package org.menfre;

/**
 * 寻找比目标字母大的最小字母
 *
 * @author menfre
 */
public class NextGreatestLetter {

    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int hight = letters.length - 1;

        while (low <= hight) {
            int mid = low + (hight - low) / 2;
            if (letters[mid] < target) {
                low = mid + 1;
            } else if (letters[mid] > target) {
                if (mid != 0 && letters[mid - 1] <= target) {
                    return letters[mid];
                } else {
                    hight = mid - 1;
                }
            } else {
                if (mid != letters.length - 1 && letters[mid + 1] > target) {
                    return letters[mid + 1];
                } else {
                    low = mid + 1;
                }
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] chars = {'c', 'f', 'j'};
//        char[] chars = {'c', 'f', 'j'};
        System.out.println(new NextGreatestLetter().nextGreatestLetter(chars, 'j'));
    }
}
