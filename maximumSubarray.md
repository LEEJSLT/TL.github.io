# Tao's Blind 75 Journey
## Array - Maximum Subarray - LeetCode # 53 - Medium

> Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
> A subarray is a contiguous part of an array.

### Solution 1 - Java - Dynamic Programming
```java
    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++){

            sum = Integer.max(sum+nums[i], nums[i]);
            if (sum > ans){
                ans = sum;
            }

        }
        return ans;
    }
    
```