class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long sum = 0;
        long maxi = Integer.MIN_VALUE;
        long mini = Integer.MAX_VALUE;
        int i = 0;
        while(i<n){
            while(i<n && nums[i]>=maxi ){
                maxi = nums[i];
                i++;
            }
            sum += maxi;
            if(i==n || i == n-1) return sum;
            maxi = Integer.MIN_VALUE;
            while(i<n && nums[i]<=mini){
                mini = nums[i];
                i++;
            }
            if(i!=n)sum -= mini;
            mini = Integer.MAX_VALUE;
        }
        return sum;
        // long ans = nums[0];
        // for(int i = 1; i<nums.length;i++){
        //     if(nums[i]>nums[i-1]){
        //         ans += nums[i]-nums[i-1];
        //     }
        // }
        // return ans;
        
    }
}