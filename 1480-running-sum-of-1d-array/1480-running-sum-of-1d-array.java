class Solution {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        int sums = 0;
        for(int i = 0; i < nums.length; i++){
            sums += nums[i];
            ans[i] = sums;
        }
        return ans;        
    }
}