# Tao's Blind 75 Journey
## Array - Maximum Product Subarray - LeetCode # 152 - Medium

> Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
> The test cases are generated so that the answer will fit in a 32-bit integer.
> A subarray is a contiguous subsequence of the array.

### Solution 1 - Java - Dynamic Programming

```java
    public static int maxProduct(int[] nums) {

        int ans = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0){

                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(max * nums[i], nums[i]);
            min = Math.min(min * nums[i], nums[i]);

            ans = Math.max(max, ans);

        }

        return ans;

    }
```