class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            int diff = (j - i) * Math.min(height[i], height[j]);
            if(diff > water){
                water = diff;
            }
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return water;
    }
}