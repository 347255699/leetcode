package org.menfre;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 下一个更大元素 I
 *
 * @author menfre
 */
public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j = map.get(nums1[i]) + 1;
            for(; j < nums2.length; j++){
                if (nums1[i] < nums2[j]) {
                    result[i] = nums2[j];
                    break;
                }
            }
            if(j == nums2.length){
                result[i] = -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        System.out.println(Arrays.toString(new NextGreaterElement().nextGreaterElement(nums1, nums2)));
    }
}
