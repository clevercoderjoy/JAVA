class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int right = mat[0].length - 1;
        int top = 0; 
        int bottom = mat.length - 1;
        if(mat.length == 0){
            return res;
        }
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                res.add(mat[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                res.add(mat[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    res.add(mat[bottom][i]);
                }
            }
            bottom--;
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    res.add(mat[i][left]);
                }
            }
            left++;
        }
        return res;
    }
}