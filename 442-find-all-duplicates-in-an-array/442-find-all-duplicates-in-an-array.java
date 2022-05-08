class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int pos = Math.abs(nums[i]) - 1;
            if(nums[pos] < 0){
                ans.add(pos + 1);
            }
            nums[pos] = -nums[pos];
        }
        return ans;
    }
}