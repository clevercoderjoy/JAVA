class Solution {
    public String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int i = 0;
        for(int j = 0; j < s.length(); j++){
            char currChar = s.charAt(j);
            if(i > 0 && currChar == stack[i - 1]){
                i--;
            }
            else{
                stack[i] = currChar;
                i++;
            }
        }
        return new String(stack, 0, i);
    }
}