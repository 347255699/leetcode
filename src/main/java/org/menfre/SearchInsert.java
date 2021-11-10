package org.menfre;

/**
 * 搜索插入位置
 * @author menfre
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        // 利用二分法实现 O(logn) 查询效率
        return binarySearch(0, nums.length - 1, nums, target);
    }

    private int binarySearch(int low, int hight, int[] arr, int i) {
        int mid = low + (hight - low) / 2;
        if(hight < low || arr[mid] == i){
            return mid;
        }
        if(arr[mid] > i){
            return binarySearch(low, mid - 1, arr, i);
        }else{
            return binarySearch(mid + 1, hight, arr, i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(new SearchInsert().searchInsert(nums, target));
    }
}
