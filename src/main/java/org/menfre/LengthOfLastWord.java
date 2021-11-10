package org.menfre;

/**
 * @author menfre
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ' && index == 0){
                continue;
            }
            if(s.charAt(i) == ' ' && index > 0){
                break;
            }else{
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("luffy is still joyboy"));
    }
}
