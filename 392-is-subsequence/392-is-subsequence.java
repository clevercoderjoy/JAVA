class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int p1 = 0;
        int p2 = 0;
        while(p2 < t.length()){
            if(s.charAt(p1) == t.charAt(p2)){
                p1++;
                if(p1 == s.length()){
                    return true;
                }
            }
            p2++;
        }
        return false;
    }
}