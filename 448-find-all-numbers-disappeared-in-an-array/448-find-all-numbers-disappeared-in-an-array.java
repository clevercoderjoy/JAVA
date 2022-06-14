class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int n = nums.length;
            List<Integer> ans = new ArrayList<>();
        while(i < n){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else
                i++;
        }
        for(int j = 0; j < n; j++){
            if(nums[j] != j + 1)
                ans.add(j + 1);
        }
        return ans;
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}