class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int length = Integer.MAX_VALUE;
        if(n==1 && strs[0].length()>0){
           return strs[0];
        }
        for(int i = 0; i<n-1;i++){
            String s1 = strs[i];
            String s2 = strs[i+1];
            
            int k = Math.min(s1.length(),s2.length());
            int j = 0;
            int count = 0;
            while(j<k){
                if(s1.charAt(j)==s2.charAt(j)){
                    count += 1;
                    j++;
                }else{
                    break;
                }
            }
            if (count>0){
                length = Math.min(length,count);
            }else{
                return "";
            }
            
        }
       
        if(length == Integer.MAX_VALUE){
            return "";
        }else{
            String ans = strs[0].substring(0,length);
            return ans;
        }
        
    }
}