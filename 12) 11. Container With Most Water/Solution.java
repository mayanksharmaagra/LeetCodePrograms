class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int left=0;
        int right=height.length-1;
        while (left<right){
            int temp=Math.min(height[left],height[right])*(right-left);
            res=Math.max(temp,res);
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return res;
    }
}