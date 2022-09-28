class Solution {

    // > You are given an array prices where prices[i] is the price of a given stock on the ith day.
    // > You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    // > Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    // public static int maxProfit(int[] prices) {
    //     int profit = 0;
    //     for (int i = 0; i < prices.length; i++){
    //         int buyPrice = prices[i];
    //         for (int j = i+1; j < prices.length; j++){
    //             int sellPrice = prices[j];
    //             // no need to consider the negative condition
    //             // if (sellPrice < buyPrice) continue;
    //             // else{
    //                 int newProfit = sellPrice - buyPrice;
    //                 if (newProfit > profit){
    //                     profit = newProfit;
    //                 // }
    //             }
    //         }
    //     }
    //     return profit;
    // }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i ++){

            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
            else if (prices[i] - minPrice > profit){
                profit = prices[i] - minPrice;
            }
        }

        return profit;
    }


    
//     public static void main(String[] args) {
//         int[] prices = new int[]{7,1,5,3,6,4};
//         int result = Solution.maxProfit(prices);
//         System.out.println(result);
//         }
}
    

