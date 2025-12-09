class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        int start = 0;
        int sum = 0;
        int mini = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            // shrink window while sum >= target
            while (sum >= target) {
                mini = Math.min(mini, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }

        return (mini == Integer.MAX_VALUE) ? 0 : mini;
    }
}
 
    