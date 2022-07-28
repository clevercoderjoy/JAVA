class Solution {
    public int calculate(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int curr = 0;
        char op = '+';
        char[] ch = s.toCharArray();
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < ch.length; i++){
            if(Character.isDigit(ch[i]))
                curr = curr * 10 + ch[i] - '0';
            if(!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length - 1){
                if(op == '+')
                    stack.push(curr);
                else if (op == '-')
                    stack.push(-curr);
                else if(op == '*')
                    stack.push(stack.pop() * curr);
                else if(op == '/')
                    stack.push(stack.pop() / curr);
                op = ch[i];
                curr = 0;
            }
        }
        int sum = 0;
        while(!stack.isEmpty())
            sum += stack.pop();
        return sum;
    }
}