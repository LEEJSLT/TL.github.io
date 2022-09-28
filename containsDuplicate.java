import java.util.*;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        // Duplicate - Data structure set{
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        if (set.size() < nums.length){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5,6,7,1};
        boolean result = containsDuplicate(a);
        System.out.println(result);
    }

//     public static void main(String[] args) {
//         int[] prices = new int[]{7,1,5,3,6,4};
//         int result = Solution.maxProfit(prices);
//         System.out.println(result);
//         }


}