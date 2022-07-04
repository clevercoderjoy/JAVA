class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target1) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return res;
        }
        Arrays.sort(nums);
        int n = nums.length;
        long target = target1;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                long subRes = target - nums[i] - nums[j];
                int left = j + 1;
                int right = n - 1;
                while(left < right){
                    long twoSum = nums[left] + nums[right];
                    if(twoSum < subRes){
                        left++;
                    }
                    else if(twoSum > subRes){
                        right--;
                    }
                    else{
                        List<Integer> quads = new ArrayList<>();
                        quads.add(nums[i]);
                        quads.add(nums[j]);
                        quads.add(nums[left]);
                        quads.add(nums[right]);
                        res.add(quads);
                        while(left < right && nums[left] == quads.get(2)){
                            left++;
                        }
                        while(left < right && nums[right] == quads.get(3)){
                            right--;
                        }
                    }
                }
                while(j + 1 < n && nums[j + 1] == nums[j]){
                    j++;
                }
            }
            while(i + 1 < n && nums[i + 1] == nums[i]){
                i++;
            }
        }
        return res;
    }
}