package org.menfre;

import java.util.HashSet;
import java.util.Set;

/**
 * 检测大写字母
 *
 * @author menfre
 */
public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        Set<Character> set = new HashSet<>(26);
        for (int i = 0; i < 26; i++) {
            set.add((char) ('A' + i));
        }

        boolean firstUpper = false;
        boolean otherUpper = true;
        boolean otherLower = true;
        for (int i = 0; i < word.length(); i++) {
            if (i == 0) {
                // 首字母大写
                firstUpper = set.contains(word.charAt(i));
            } else {
                if (!set.contains(word.charAt(i))) {
                    otherUpper = false;
                }
                if (set.contains(word.charAt(i))) {
                    otherLower = false;
                }
            }
        }

        if (firstUpper && otherUpper) {
            return true;
        } else if (firstUpper && otherLower) {
            return true;
        } else {
            return !firstUpper && otherLower;
        }
    }

    public static void main(String[] args) {
        System.out.println(new DetectCapitalUse().detectCapitalUse("FlaG"));
    }
}
