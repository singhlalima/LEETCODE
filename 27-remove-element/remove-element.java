class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            if(nums[i] == val){
                count +=1;
            }
        }
        if (count == nums.length){
            return 0;
        }
        int j =nums.length -1;
        int i=0;
        while(i<j){
            while(nums[j] == val){
            j--;
        }
        while(nums[i] !=val){
            if (i<j){
                i++;
            }
            else{
                break;
            }
            
        }
        if (nums[i] == val){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        }
      
        
        
        int k = nums.length-count;
        return k;
        
    }
}