class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int prefix [] = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i<n;i++){
            prefix[i] = prefix[i-1]+nums[i]; 
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        for(int i = 0; i<prefix.length; i++){
            //int num1 =+ prefix[i];
            int num = prefix[i]%k;
            
           if(map.containsKey(num)){
                if(i-map.get(num)>=2){
                    return true;
                }
           }else{
            map.put(num,i);
           }
            
        }
        return false;
        
    }
}