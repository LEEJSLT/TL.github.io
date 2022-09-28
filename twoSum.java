// Java program to demonstrate
// adding elements to Hashtable
import java.util.*;

class Solution {

    // brute force method
    // public int[] twoSum(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++){
    //         for (int j = i+1; j < nums.length; j++){
    //             if (nums[i] + nums[j] == target)
    //             return new int[]{i, j};
    //         }
    //     }
    //     return new int[0];
    // }
    
    // hash table
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

    public static void main(String[] args) {
    // solution sl = new solution();
    int[] a = new int[]{1,2,3,4};
    System.out.println(a.length);
    System.out.println(a[0]);
    }

}