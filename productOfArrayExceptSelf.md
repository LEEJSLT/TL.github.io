# Tao's Blind 75 Journey
## Array - Product Of Array Except Self - LeetCode # 238 - Medium

> Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
> The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
> You must write an algorithm that runs in O(n) time and without using the division operation.

### Solution 1 - Java - Brute Force
```java
    public static int[] productExceptSelf(int[] nums) {
        int le = 1;
        int ri = 1;
        int[] leList = new int[nums.length];
        int[] riList = new int[nums.length];
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            leList[i] = le;
            le = le * nums[i];
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            riList[j] = ri;
            ri = ri * nums[j];
        }

        for (int k = 0; k < nums.length; k++) {
            target[k] = leList[k] * riList[k];
        }

        return target;
    }
```

### 