class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Store frequency of nums1
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Step 2: Traverse nums2
        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                list.add(n);
                map.put(n, map.get(n) - 1);
            }
        }

        // Step 3: Convert ArrayList to array
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
