https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                max=prices[i];
            }
            else{
                max=prices[i];
                profit=Math.max(profit,max-min);
            }
        }
        return profit;
    }
}
