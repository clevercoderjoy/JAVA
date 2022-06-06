class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cS : s.toCharArray()){
            c ^= cS;
        }
        for(char cT : t.toCharArray()){
            c ^= cT;
        }
        return c;
    }
}