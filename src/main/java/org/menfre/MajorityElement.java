package org.menfre;

/**
 * 多数元素
 *
 * @author menfre
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int c = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                c = num;
            }
            if(c == num){
                count++;
            }else{
                count--;
            }
        }
        return c;
    }

    public static void main(String[] args) {
//        int[] nums = {3, 2, 3};
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(new MajorityElement().majorityElement(nums));
    }
}
