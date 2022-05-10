class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int pr = 0;
        for(int i = 0; i < n; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(Math.abs(min - prices[i]) > pr){
                pr = Math.abs(min - prices[i]);
            }
        }
        return pr;
    }
}