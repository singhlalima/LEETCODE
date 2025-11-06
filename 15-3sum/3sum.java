import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        // Outer loop to fix one element
        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate fixed elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int k = nums[i];
            int j = n - 1;      // reset j for each i
            int l = i + 1;      // left pointer (renamed for your style)

            while (l < j) {     //  fixed condition
                int sum = nums[l] + nums[j];   // pair sum

                if (sum + k == 0) {            //  correct comparison
                    List<Integer> temp = new ArrayList<>();
                    temp.add(k);
                    temp.add(nums[l]);
                    temp.add(nums[j]);
                    ans.add(temp);

                    // move both pointers
                    l++;
                    j--;

                    // skip duplicates on both sides
                    while (l < j && nums[l] == nums[l - 1]) l++;
                    while (l < j && nums[j] == nums[j + 1]) j--;
                }
                else if (sum + k < 0) {
                    l++; // need a bigger sum
                } 
                else {
                    j--; // need a smaller sum
                }
            }
        }
        return ans;
    }
}
