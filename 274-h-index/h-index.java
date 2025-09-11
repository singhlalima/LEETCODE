class Solution {
    public int hIndex(int[] nums) {
        int count = 0;
        int h = 0;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            count = nums.length-i;
            if (count<=nums[i]){
                h = count;
                break;
            }
            
        }
        return h;
    }
}