package org.leatcode150;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {

        int maxPrice =Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] > prices[i]){
                    maxPrice= Math.max(maxPrice, prices[j] - prices[i]);
                }
            }
        }

        return maxPrice;

    }
}
