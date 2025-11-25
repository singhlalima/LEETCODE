class Solution {
    public int ways(int nums[], int s1, int n) {
        int dp[][] = new int[n + 1][s1 + 1];
        dp[0][0] = 1;         // empty subset makes sum 0

        for (int j = 1; j <= s1; j++) {
            dp[0][j] = 0;     // no way to make positive sum with 0 elements
        }

        for (int i = 1; i <= n; i++) {
            dp[i][0] = 1;     // sum 0 always possible (by not choosing)
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= s1; j++) {   // ✔ j must start at 0
                dp[i][j] = dp[i - 1][j];     // not take nums[i-1]

                if (nums[i - 1] <= j) {
                    dp[i][j] += dp[i - 1][j - nums[i - 1]];  // take nums[i-1]
                }
            }
        }
        return dp[n][s1];
    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) sum += num;

        if ((sum + target) % 2 != 0 || sum < Math.abs(target)) return 0;

        int s1 = (sum + target) / 2;
        return ways(nums, s1, nums.length);
    }
}
