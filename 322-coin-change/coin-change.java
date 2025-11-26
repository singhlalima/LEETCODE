
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


