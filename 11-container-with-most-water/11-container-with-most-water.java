class Solution {
    public int maxArea(int[] arr) {
        int water = 0;
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int diff = (j - i) * Math.min(arr[i], arr[j]);
            if(diff > water){
                water = diff;
            }
            if(arr[i] < arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return water;
    }
}