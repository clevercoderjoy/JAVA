class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(nums == null || n == 0){
            return;
        }
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
            if(i >= 0){
                int j = n - 1;
                while(nums[j] <= nums[i]){
                    j--;
                }
                swap(nums, i, j);
            }
        reverse(nums, i + 1, n - 1);
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
    public void reverse(int[] nums, int first, int second){
        while(first < second){
            swap(nums, first++, second--);
        }
    }
}