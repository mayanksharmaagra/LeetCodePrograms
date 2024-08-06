class Solution {
    public int[] productExceptSelf(int[] nums) {
    /*    int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int last = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            nums[i] = ans[i] * last;
            last = num * last;
        }
        return nums;
        */
        int[] ans = new int[nums.length];
        int last = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = last;
            last *= nums[i];
        }
        last = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *=last;
            last *= nums[i];
        }
        return ans;
    }
}