package org.menfre;

/**
 * 提莫攻击
 * @author menfre
 */
public class FindPoisonedDuration {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            int interval = timeSeries[i] + duration - timeSeries[i];
            if(i != timeSeries.length - 1){
                if (timeSeries[i + 1] - timeSeries[i] < interval) {
                    interval = timeSeries[i + 1] - timeSeries[i];
                }
            }
            sum += interval;
        }
        return sum;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 4};
        int[] nums = {1,2,3,4,5};
        System.out.println(new FindPoisonedDuration().findPoisonedDuration(nums, 5));
    }
}
