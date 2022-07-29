class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack();
        Stack<String> str = new Stack();
        String res = "";
        int idx = 0;
        while(idx < s.length()){
            if(Character.isDigit(s.charAt(idx))){
                int count = 0;
                while(Character.isDigit(s.charAt(idx))){
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx += 1;
                }
                counts.push(count);
            }
            else if(s.charAt(idx) == '['){
                str.push(res);
                res = "";
                idx += 1;
            }
            else if(s.charAt(idx) == ']'){
                StringBuilder sb = new StringBuilder(str.pop());
                int count = counts.pop();
                for(int i = 0; i < count; i++){
                    sb.append(res);
                }
                res = sb.toString();
                idx += 1;
            }
            else{
                res += s.charAt(idx);
                idx += 1;
            }
        }
        return res;
    }
}