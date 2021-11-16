package org.menfre;

/**
 * 买卖股票的最佳时机
 *
 * @author menfre
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxPrice = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else{
                if(prices[i] - minPrice > maxPrice){
                    maxPrice = prices[i] - minPrice;
                }
            }
        }
        return maxPrice;
    }

    public static void main(String[] args) {
        int[] prices = {2, 4, 1};
        System.out.println(new MaxProfit().maxProfit(prices));
    }
}
