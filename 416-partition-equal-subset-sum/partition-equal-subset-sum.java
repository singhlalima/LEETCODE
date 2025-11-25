class Solution {
    public static boolean subsetSum(int[] nums, int n, int k){
            boolean dp[][] = new boolean[n+1][k+1];
            for(int i = 0; i<n+1;i++){
                for(int j = 0; j<k+1;j++){
                    if(i==0) dp[0][j] = false;
                    if(j==0) dp[i][0] = true;
                }
            }
            for(int i = 1;i<n+1;i++){
                for(int j = 1; j<k+1;j++){
                    if(nums[i-1]<=j){
                        dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                    }else if(nums[i-1]>j){
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            return dp[n][k];
        }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<n;i++){
            sum += nums[i];
        }
        int k = sum/2;
        
        if(sum%2!=0) return false;
        else if(sum%2 == 0){
             return subsetSum(nums,n,k);
        }
        else return false;
        
        
    }
}