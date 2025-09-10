class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int ans =0;
        int j = 1;
        int i = 0;
        while(i<prices.length && j<prices.length){
            if (prices[i]<prices[j]){
                ans = prices[j]-prices[i];
                profit = Math.max(profit,ans);
                // System.out.println(profit);
                j++;
            }
            else{
                i = j;
                j++;
                
            }
        }
        return profit; 
        
        
    }
}