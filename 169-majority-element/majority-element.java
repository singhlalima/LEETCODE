class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int maj = n/2;
        int count = 1;
        int k = 0;
        Arrays.sort(nums);
        for(int i = 0; i<n-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                if(count>maj){
                    k = i;
                    return nums[k];
                }
            }else{
                count = 1;
            }
        }

        
       return nums[k];
    }
}