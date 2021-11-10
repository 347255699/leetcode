package org.menfre;


/**
 * 移除元素
 * @author menfre
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        // 采用双针法，将无效数据堆砌在数组末尾
        int p = 0, q = 0;
        for (; p < nums.length; p++) {
            if (nums[p] == val) {
                for (q = p + 1; q < nums.length; q++) {
                    if(nums[q] != val){
                        nums[p] = nums[q];
                        nums[q] = val;
                        break;
                    }
                }
            }
            if(q >= nums.length){
                break;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int len = new RemoveElement().removeElement(ints, val);
        for (int i = 0; i < len; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
