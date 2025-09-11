class Solution {
    public int jump(int[] nums) {
        int n = nums.length -1;
        int min_step = 0;
        int max_reach = 0;
        int boundary = 0;

        for (int i = 0; i<nums.length-1; i++){
            max_reach = Math.max(max_reach,i+nums[i]);
            if(i==boundary){
                min_step++;
                boundary = max_reach;
            }
            
        }
        return min_step;
        
       
      
       
        
    }
}