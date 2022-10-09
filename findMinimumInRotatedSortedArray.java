class SolutionFindMin {
    public static int findMin(int[] nums) {

        // int ans = nums[0];
        int left = 0;   // get the left initial value
        int right = nums.length - 1;    // get the right initial value

        while (left < right){

            int mid = (left + right) / 2; // get the middle index
            
            if ((nums[left] > nums[mid] && nums[mid] < nums[right]) || (nums[left] < nums[mid] && nums[mid] < nums[right])){
                right = mid - 1; 
            } else {
                left = mid;
            }
        }

        return nums[right];
        
    }

    public static void main(String[] args) {
        // int[] a = new int[] { 3,4,5,1,2 };
        int[] a = new int[] { 11,13,15,17 };
        System.out.println(findMin(a));
    }
}

// https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array/solution/er-fen-cha-zhao-wei-shi-yao-zuo-you-bu-dui-cheng-z/