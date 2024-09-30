/*Leetcode Problem 
122. Best Time to Buy and Sell Stock II */
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for(int i = 0; i < prices.length-1; i++){
            int temp = prices[i+1] - prices[i];
            if(temp <= 0){
                continue;
            }

            ans += temp;

        }
        return ans;
    }
}
