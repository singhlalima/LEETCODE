class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 

        
        int start = 0, end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        
        int i = 0, j = k - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        
        int m = k, p = n - 1;
        while (m < p) {
            int temp = nums[m];
            nums[m] = nums[p];
            nums[p] = temp;
            m++;
            p--;
        }

        System.out.println(Arrays.toString(nums));
    }
}