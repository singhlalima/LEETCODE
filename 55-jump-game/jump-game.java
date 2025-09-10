// class Solution {
//     public boolean canJump(int[] nums) {
//         int jump = nums[0];
//         int idx = nums.length-1;
//         int temp = 0;
//         int i = 0;
        
//         while(i<nums.length){
           
//             if((jump - (idx-i))>=0){
//                 return true;
//             }
//             else{
//                 temp = jump;
//                 int flag  = 0;
//                 while(temp>0){
//                     i++;
//                     if(nums[i]>=jump){
//                         jump = nums[i];
//                         flag=1;
//                         break;

//                     }
//                     else{
//                         if(nums[i]-(nums.length-1-i)>=0){
//                             flag =2;
//                             break;
//                         }
//                     }
//                     temp --;
                    
//                 }
        
//                 if (flag == 0){
//                     jump = nums[i];
//                 }
                
//                 if((jump == 0) || (flag==2)){
//                     break;
//                 }
//             }
//         }
//         if (jump == 0){
//             return false;
//         }
//         else{
//             return true;
//         }
        
        
//     }
// }

class Solution {
    public boolean canJump(int[] nums) {
        int power = 0;
        for (int i = 0 ; i<nums.length;i++){
           if(power>=i){
            power = Math.max(power,nums[i]+i);
           }
        }
        if(power>=nums.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}