class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0] = firstOccurrence(nums, target);
        res[1] = lastOccurrence(nums, target);
        return res;
    }
    
    public int firstOccurrence(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                index = mid;
                end = mid - 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return index;
    }
    
    public int lastOccurrence(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                index = mid;
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return index;
    }
    
}