<<<<<<< HEAD
class SolutionMaximumProductSubarray {
    public static int maxProduct(int[] nums) {

        int ans = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;

        for (int i = 0; i < nums.length; i++) {

            // // if (nums[i] == 0) {
            // //     continue;
            // // } else {
            //     pro = Integer.max(pro * nums[i], pro);


            //     if (pro < 0 && pro < min) {
            //         min = pro;
            //     } 
                
            //     if (pro > 0 && pro > max) {

            //         max = pro;
            //     }
            // // }

            if (nums[i] < 0){

                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(max * nums[i], nums[i]);
            min = Math.min(min * nums[i], nums[i]);

            ans = Math.max(max, ans);

        }

        return ans;

    }

    public static void main(String[] args) {
        int[] a = new int[] { -1, 0, -2 };
        System.out.println(maxProduct(a));
    }
}

// If all integer are positive:
=======
class SolutionMaxProduct {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int product = nums[0];

        for (int i = 1; i < nums.length; i++){

            
        }


        return ans;
        
    }
}
>>>>>>> 36a26ec7046b93b01b9f56f2ed9cbcc9925387f7
