class Solution {
    // public int ways(int coins[], int amount, int n){
    //     int dp[][] = new int[n+1][amount+1];
    //     for(int j = 0; j<amount+1; j++){
    //         dp[0][j] = 0;
    //     }
    //     for(int i = 0; i<n+1;i++){
    //         dp[i][0] = 1;
    //     }

    //     for(int i = 1; i<n+1; i++){
    //         for(int j = 1; j<amount +1; j++){
    //             if(coins[i-1]<=j){
    //                 dp[i][j] = dp[i][j-coins[i-1]]+dp[i-1][j];
    //             }
    //             else{
    //                 dp[i][j] = dp[i-1][j];
    //             }
    //         }
    //     } return dp[n][amount];
    // }

    public int ways(int coins[], int amount, int n, int dp[][]){
        
        if(amount == 0) return 1;
        if(n==0) return 0;
    
        if(dp[n][amount] != -1) return dp[n][amount];
        else{
            if(coins[n-1]<=amount){
                return dp[n][amount] =  ways(coins,amount-coins[n-1],n,dp) +  ways(coins, amount, n-1, dp);
            }else{
                return dp[n][amount] = ways(coins,amount,n-1,dp);
            }
        }
        
        }
        
    
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];
        for(int i = 0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        int result = ways(coins,amount,n,dp);
        return result;
        
    }
}