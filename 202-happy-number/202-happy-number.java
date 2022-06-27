class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = findSq(slow);
            fast = findSq(findSq(fast));
        }
        while(slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
    }
    
    private int findSq(int n){
        int res = 0;
        while(n > 0){
            int rem = n % 10;
            res += rem * rem;
            n /= 10;
        }
        return res;
    }
}