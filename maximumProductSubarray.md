# Tao's Blind 75 Journey
## Array - Maximum Product Subarray - LeetCode # 152 - Medium

> Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
> The test cases are generated so that the answer will fit in a 32-bit integer.
> A subarray is a contiguous subsequence of the array.

[LeetCode] (https://leetcode.com/problems/maximum-product-subarray/)

### Solution 1 - Java - Brute Force

```java
    public static int maxProduct(int[] nums) {
        
        int ans = Integer.MIN_VALUE;    // initial the max value. The min value is to make sure any value can be the max value.
        if (nums.length == 1) return nums[0];   // special case: nums length is one, return the first value

        for (int i = 0; i < nums.length; i++){  // traverse the outer loop to get the start element of the subarray

            int mult = nums[i]; // get the first element of the subarray

            for (int j = i + 1; j < nums.length; j++){  // traverse the inner loop to get the max product

                // ans = Math.max(ans, mult * nums[j]); // WRONG - Double the mult * nums[j]
                ans = Math.max(ans, mult);  // compare the current ans and current mult, if we need to re-start the subarray
                mult = mult * nums[j];  // update mult
            }

            ans = Math.max(mult, ans);  //compare the last mult and ans to get the max value
        }

        return ans;
        
    }
```
#### Comment
Time Complexity O(n^2)
Space Complexity O(n)

### Solution 2 - Java - Dynamic Programming

```java
    public static int maxProduct(int[] nums) {
        // int ans = nums[0];
        int ans = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;

        for (int i = 0; i < nums.length; i++){

            if (nums[i] < 0){   // if nums[i] is negative -> reverse max and min
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            ans = Math.max(max, ans);   // Make sure ans keeps the maximum value for all the subarray
        }

        return ans;
        
    }
```
#### Comment
Time Complexity O(n)
Space Complexity O(n)