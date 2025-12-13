class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // add nums1 elements
        for (int n : nums1) {
            set.add(n);
        }

        // check nums2
        for (int n : nums2) {
            if (set.contains(n)) {
                result.add(n);
            }
        }

        // convert set to array
        int[] ans = new int[result.size()];
        int i = 0;
        for (int n : result) {
            ans[i++] = n;
        }

        return ans;
    }
}
