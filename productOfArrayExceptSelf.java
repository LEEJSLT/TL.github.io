class SolutionProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        // cannot use division operation
        int length = nums.length;
        int[] result = new int[length];
        int ri = 1; // right product
        int le = 1; // left product

        

        return result;

    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4 };
        int[] result = productExceptSelf(a);

        for (int x : result){
            System.out.println(x);
        }


    }
}