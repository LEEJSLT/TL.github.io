class SolutionFindMin {
    public static int findMin(int[] nums) {

        // int ans = nums[0];
        int left = 0;   // get the left initial value
        int right = nums.length - 1;    // get the right initial value

        while (left < right){
            int mid = (left + right) / 2; // get the middle index
            
            if (nums[left] > nums[mid]){
                right = mid; 
            } else {
                left = mid;
            }
        }

        return nums[right];
        
    }

    public static void main(String[] args) {
        int[] a = new int[] { 3,4,5,1,2 };
        System.out.println(findMin(a));
    }
}