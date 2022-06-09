class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        int count = 1;
        while(p2 < nums.length){
            if(nums[p2] != nums[p1]){
                p1++;
                swap(nums, p1, p2);
                count++;
            }
            p2++;
        }
        return count;
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}