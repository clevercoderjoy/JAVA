class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i = 0; i < nums.length - 2; i++){
            int aPointer = i + 1;
            int bPointer = nums.length - 1;
            while(aPointer < bPointer){
                int currSum = nums[i] + nums[aPointer] + nums[bPointer];
                if(currSum > target){
                    bPointer--;
                }
                else{
                    aPointer++;
                }
                if(Math.abs(currSum - target) < Math.abs(res - target)){
                    res = currSum;
                }
            }
        }
        return res;
    }
}
