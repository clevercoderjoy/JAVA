class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         int[] copy = Arrays.copyOf(nums, n);
//         Arrays.sort(copy);
//         int[] res = new int[2];
//         int start = 0;
//         int end = n - 1;
//         if(nums.length == 2 && nums[0] + nums[1] == target)
//             return new int[] {0, 1};
        
//         while(start < end){
//             int sum = copy[start] + copy[end];
//             if(sum == target)
//                 break;
//             else if(sum < target)
//                 start++;
//             else
//                 end--;
//         }
//         for(int i = 0; i < n; i++){
//             if(copy[start] == nums[i])
//                 res[0] = i;
//         }
//         for(int i = nums.length - 1; i > 0; i--){
//             if(copy[end] == nums[i])
//                 res[1] = i;
//         }
//         return res;
//   }
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = copy[left] + copy[right];

            if (sum == target) {
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == copy[left]) {
                res[0] = i;
            }
        }
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == copy[right]) {
                res[1] = i;
            }
        }
        
        return res;
    }
}