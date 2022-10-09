# Tao's Blind 75 Journey
## Array - Find Minimum In Rotated Sorted Array - LeetCode # 153 - Medium

> Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
> 
> [4,5,6,7,0,1,2] if it was rotated 4 times.
> [0,1,2,4,5,6,7] if it was rotated 7 times.
> 
> Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
> Given the sorted rotated array nums of unique elements, return the minimum element of this array.
> You must write an algorithm that runs in O(log n) time.

> Constrains
> n == nums.length
> 1 <= n <= 5000
> -5000 <= nums[i] <= 5000
> All the integers of nums are unique.
> nums is sorted and rotated between 1 and n times.

### Solution 1 - Java - Binary Division
```java

public static int findMin(int[] nums) {

    int left = 0; // get the left initial value
    int right = nums.length - 1; // get the right initial value

    while (left != right) {
        
        int mid = (left + right) / 2; // get the middle index
        if (nums[mid] > nums[right]) { // smallest in the right
            left = mid + 1;
        } else {
            right = mid;
        }
    }

    return nums[left];

}

```

#### Comment
Time Efficiency O(Logn)
Space Efficiency O(n)

Binary Division Method