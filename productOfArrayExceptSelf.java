class SolutionProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int le = 1;
        int ri = 1;
        int[] leList = new int[nums.length];
        int[] riList = new int[nums.length];
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            leList[i] = le;
            le = le * nums[i];
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            riList[j] = ri;
            ri = ri * nums[j];
        }

        for (int k = 0; k < nums.length; k++) {

            target[k] = leList[k] * riList[k];
            
        }

        return target;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4 };
        int[] result = productExceptSelf(a);

        for (int x : result) {
            System.out.println(x);
        }

    }
}