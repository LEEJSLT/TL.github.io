import java.util.*;

class SolutionContainsDuplicate {

    // using the charactistic of set data structure
    // public static boolean containsDuplicate(int[] nums) {
    //     // Duplicate - Data structure set{
    //     Set<Integer> set = new HashSet<>();
    //     for (int i = 0; i < nums.length; i++){
    //         set.add(nums[i]);
    //     }

    //     if (set.size() < nums.length){
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

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
    
    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5,6,7,1};
        boolean result = containsDuplicate(a);
        System.out.println(result);
    }


}