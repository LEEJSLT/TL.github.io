# Tao's Blind 75 Journey
## Array - Contains Duplicate - LeetCode # 217 - EASY

> Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


### 
```java

    // using the charactistic of hashset
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++){

            if (!set.add(nums[i])){
                return true;
            }
            // no need this line -> it will be added into the set in line if (!set.add(nums[i]))
            // set.add(nums[i]);
        }
        return false;
    }

```

### Java Note:
Hash Table vs Hash Map vs Hash Set