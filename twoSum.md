# Tao's Blind 75 Journey
## Array - Two Sum - LeetCode # 1 - EASY

> Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.  
> You may assume that each input would have exactly one solution, and you may not use the same element twice.  
> You can return the answer in any order.

[LeetCode: Two Sum](https://leetcode.com/problems/two-sum/)

### Solution 1 - Java - Brute Force

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target)
                return new int[]{i, j};
            }
        }
        return new int[0];
    }
}
```
#### Comment

Time Complexity O(n^2)
Space Complexity O(n)

This is the brute force method to find the solution. The brute force method comes with two FOR loop. By the comparison between the sum of two elements from the array and the target, we can get the location of the elements.  

##### Java Note  
For Java, the nums.length counts from 1.  

```java
int[] a = {1,2,3,4};
a.length = 4;
a[0] = 1;
```
##### Data Structure Note
Time Complexity Review:  
[Big O CheatSheet](https://www.bigocheatsheet.com/)

### Solution 2 - Java

```java
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // generate the hash table
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        for (int i = 0; i < nums.length; i++){
            int currentKey = nums[i];
            int targetKey = target - currentKey;
            if (hash.containsKey(targetKey)){
                return new int[]{hash.get(targetKey), i};
            }
            else{
                hash.put(currentKey, i);
            }
        }
        return new int[0];
    }
}
```

#### Comment

Time Complexity O(n)
Space Complexity O(n)

This is the Hashtable method to solve the question. Key is the value and element is the ith value. By using the O(1) complexity on Hash Table finding the Key value, the overall time complexity is O(n)
