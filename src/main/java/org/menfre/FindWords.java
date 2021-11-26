package org.menfre;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 键盘行
 * @author menfre
 */
public class FindWords {

    public String[] findWords(String[] words) {
        String[] strs = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>(26, 1L);
        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].contains(String.valueOf(c))) {
                    map.put(c, j + 1);
                    break;
                }
            }
        }

        String[] words2 = new String[words.length];
        int k = 0;
        for (String word : words) {
            String str = word.toLowerCase();
            int row = map.get(str.charAt(0));
            int i = 1;
            for (; i < word.length(); i++) {
                if (row != map.get(str.charAt(i))) {
                    break;
                }
            }
            if(i == word.length()){
                words2[k] = word;
                k++;
            }
        }

        String[] words3 = new String[k];
        System.arraycopy(words2, 0, words3, 0, k);
        return words3;
    }

    public static void main(String[] args) {
        String[] words = {"Aasdfghjkl","Qwertyuiop","zZxcvbnm"};
        System.out.println(Arrays.toString(new FindWords().findWords(words)));
    }
}
