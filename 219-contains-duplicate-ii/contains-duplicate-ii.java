class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        HashMap<Integer,Integer> lastIndex = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);

        }

        for(int i= 0; i<nums.length;i++){
            if(freq.get(nums[i])>1){
                if(lastIndex.containsKey(nums[i])){
                    int prev = lastIndex.get(nums[i]);
                    int curr = i;

                    if(Math.abs(prev-curr)<=k) return true;
                }
                lastIndex.put(nums[i],i);
            }
        }
        return false ;

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < nums.length; i++) {
        //     if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
        //         return true;

        //     map.put(nums[i], i); // store/update last seen index
        // }

        // return false;

    }
}