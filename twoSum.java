class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target)
                return new int[]{i, j};
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