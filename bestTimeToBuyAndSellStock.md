# Tao's Blind 75 Journey
## Array - Best Time To Buy And Sell Stock - LeetCode #121 - EASY

> You are given an array prices where prices[i] is the price of a given stock on the ith day.
> You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
> Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

[LeetCode: Best Time To Buy And Sell Stock](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/)

### Solution 1 - Java - Brute Force

```java
    public static int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length; i++){
            int buyPrice = prices[i];

            for (int j = i+1; j < prices.length; j++){
                int sellPrice = prices[j];
                // no need to consider the negative condition
                // if (sellPrice < buyPrice) continue;
                // else{
                    int newProfit = sellPrice - buyPrice;
                    if (newProfit > profit){
                        profit = newProfit;
                    // }
                }
            }
        }
        return profit;
    }

```
#### Comment
Time Complexity O(n^2)
Space Complexity O(1)

### Solution 2 - Java - One Round

```java
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
```

#### Comment
Time Complexity O(n)
Space Complexity O(1)

In one round, we need to focus on the min price. In the same round, the value after the min price will be used to check the profit. If the minimum value update, the profit check will start again.