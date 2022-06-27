class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] chArr = new int[26];
        for(int i = 0; i < s.length(); i++){
            chArr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            chArr[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < chArr.length; i++){
            if(chArr[i] != 0){
                return false;
            }
        }
        return true;
    }
}