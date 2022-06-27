class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if(m < n){
            return -1;
        }
        if(n == 0){
            return 0;
        }
        int threshold = m - n;
        for(int i = 0; i <= threshold; i++){
            if(haystack.substring(i, i + n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}