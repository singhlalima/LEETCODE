class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        
        List<String> ans = new ArrayList<>();
        if(n==0) return ans;
        int start = nums[0];
        int last = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] + 1 == nums[i]) {
                last = nums[i];
            } else {

                if (last != start) {
                    String s = start + "->" + last;
                    ans.add(s);
                } else {
                    String s = new String();
                    s = s + start;
                    ans.add(s);
                }
            
                start = nums[i];
                last = start;
            }
        }

        if (last != start) {
            String s = start + "->" + last;
            ans.add(s);
        } else {
            String s = new String();
            s = s + start;
            ans.add(s);
        }
        return ans;
    }
}