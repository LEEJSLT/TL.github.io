class SolutionFindMin {
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

    public static void main(String[] args) {
        // int[] a = new int[] { 3,4,5,1,2 };
        int[] a = new int[] { 11, 13, 15, 17 };
        System.out.println(findMin(a));
    }
}

// https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array/solution/er-fen-cha-zhao-wei-shi-yao-zuo-you-bu-dui-cheng-z/