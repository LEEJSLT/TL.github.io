class SolutionMaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++){

            sum = Integer.max(sum+nums[i], nums[i]);
            if (sum > ans){
                ans = sum;
            }

        }
        return ans;
    }
    
    public static void main(String[] args) {
    // solution sl = new solution();
    int[] a = new int[]{-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(a));
    // System.out.println(a[0]);
    }



}