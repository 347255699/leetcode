package org.menfre;

/**
 * 机器人能否返回原点
 *
 * @author menfre
 */
public class JudgeCircle {

    public boolean judgeCircle(String moves) {
        int x = 0,y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if(c == 'U'){
                y++;
            }else if(c == 'D'){
                y--;
            }else if(c == 'L'){
                x--;
            }else {
                x++;
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        System.out.println(new JudgeCircle().judgeCircle("LL"));
    }
}
