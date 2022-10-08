class SolutionMaxProduct {
    public static int maxProduct(int[] nums) {
        int ans = nums[0];
        int max = 1;
        int min = 1;

        for (int i = 0; i < nums.length; i++){

            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            ans = Math.max(max, ans);


        }

        return ans;
        
    }

    public static void main(String[] args) {
        int[] a = new int[] { -1, 0, -2 };
        System.out.println(maxProduct(a));
    }
}