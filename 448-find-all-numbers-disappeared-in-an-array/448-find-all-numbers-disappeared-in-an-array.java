class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] !=  nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                res.add(j + 1);
            }
        }
        return res;
    }
    
    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}