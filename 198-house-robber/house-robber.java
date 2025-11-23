class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==1) return nums[0];
        if (n==2) return Math.max(nums[0],nums[1]);
        int a = nums[n-1];
        int b = nums[n-2];
        int i = n-3;
        
        
        int ans [] = new int[n];
        ans[n-1] = nums[n-1];
        ans[n-2] = nums[n-2];
        while(i>=0){
            ans[i] = nums[i] + a;
            a = Math.max(a,b);
            b=ans[i];
            i--;
        }

        
        return Math.max(ans[0],Math.max(a,b));
        
        
    }
}