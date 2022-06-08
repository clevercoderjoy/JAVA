class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int iVal;
        int jVal;
        int carry = 0;
        String res = "";
        while(i >= 0 || j >= 0 || carry != 0){
            if(i >= 0){
                iVal = num1.charAt(i) - '0';
            }
            else{
                iVal = 0;
            }
            if(j >= 0){
                jVal = num2.charAt(j) - '0';
            }
            else{
                jVal = 0;
            }
            i--;
            j--;
            int sum = iVal + jVal + carry;
            res = (sum % 10) + res;
            carry = sum / 10;
        }
        return res;
    }
}