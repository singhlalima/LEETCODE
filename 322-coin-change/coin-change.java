class Solution {
    int dp[];
    int INF = (int)1e9;

    public int helper(int[] coins, int amount){
        if(amount == 0) return 0;        // 0 coins needed
        if(amount < 0) return INF;       // invalid
        if(dp[amount] != -1) return dp[amount];

        int ans = INF;

        // try all coins
        for(int coin : coins){
            ans = Math.min(ans, 1 + helper(coins, amount - coin));
        }

        return dp[amount] = ans;
    }

    public int coinChange(int[] coins, int amount){
        dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int result = helper(coins, amount);

        return result >= INF ? -1 : result;
    }
}
