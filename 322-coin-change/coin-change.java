import java.util.*;

class Solution {
    public static int ways(int coins[], int amount,int n){
        int dp[][] = new int[n+1][amount+1];
        int INF = Integer.MAX_VALUE - 1;

        // Base cases
        for(int i = 0; i <= n; i++){
            dp[i][0] = 0;              // 0 coins needed to make amount 0
        }
        for(int j = 1; j <= amount; j++){
            dp[0][j] = INF;            // can't make positive amount with 0 coins
        }

        // First row: using only coin[0]
        for(int j = 1; j <= amount; j++){
            if(j % coins[0] == 0){
                dp[1][j] = j / coins[0];
            } else {
                dp[1][j] = INF;
            }
        }

        // Fill rest of DP table
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= amount; j++){
                if(coins[i-1] <= j){
                    dp[i][j] = Math.min(1 + dp[i][j - coins[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        if (amount == 0) return 0;      // no coins needed for 0 amount

        int result = ways(coins, amount, n);
        int INF = Integer.MAX_VALUE - 1;
        if(result >= INF) return -1;    // not possible to form amount
        return result;
    }
}


// class Solution {
//     public static int ways(int coins[], int amount,int n){
//         int dp[][] = new int[n+1][amount+1];
       
//         for(int i = 0; i<n+1;i++){
//             dp[i][0] = Integer.MAX_VALUE-1;
//         }
//         for(int j = 0; j<amount+1;j++){
//             dp[0][j] = 0;
//         }
//         for(int j=1; j<amount+1;j++){
//             if(coins[0]%j == 0){
//                 dp[1][j] = coins[0]/j;
//             }else{
//                 dp[1][j] = Integer.MAX_VALUE-1;
//             }
//                     }
        
//         for(int i =2; i<n+1;i++){
//             for(int j = 1; j<amount+1;j++){
//                 if(coins[i-1]<=j){
//                     dp[i][j] = Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
//                 }else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][amount];
//     }
//     public int coinChange(int[] coins, int amount) {
//         int n = coins.length;
//         int result = ways(coins,amount,n);
//         if(n==1 && amount<coins[0]) return 0;
//         if(result == Integer.MAX_VALUE-1) return -1;
//         return result;
        
//     }
// }