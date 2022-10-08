class SolutionMaxProduct {
    
    // Brute Force
    public static int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;

        if (nums.length == 1) return nums[0];

        for (int i = 0; i < nums.length; i++){

            int mult = nums[i];

            for (int j = i + 1; j < nums.length; j++){

                ans = Math.max(ans, mult);
                mult = mult * nums[j];


            }

            ans = Math.max(mult, ans);
        }

        return ans;
        
    }




    // // Dynamic Programming
    // public static int maxProduct(int[] nums) {
    //     // int ans = nums[0];
    //     int ans = Integer.MIN_VALUE;
    //     int max = 1;
    //     int min = 1;

    //     for (int i = 0; i < nums.length; i++){

    //         if (nums[i] < 0){
    //             int temp = max;
    //             max = min;
    //             min = temp;
    //         }

    //         max = Math.max(nums[i], max * nums[i]);
    //         min = Math.min(nums[i], min * nums[i]);

    //         ans = Math.max(max, ans);
    //     }

    //     return ans;
        
    // }

    public static void main(String[] args) {
        int[] a = new int[] { -3, 0, 1, -2 };
        System.out.println(maxProduct(a));
    }
}