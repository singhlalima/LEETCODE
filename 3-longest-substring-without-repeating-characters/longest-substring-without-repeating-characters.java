class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        HashMap<Character,Integer> map = new HashMap<>();

        int start = 0, end=0;
        int maxLen = 0;
        
        while(end<s.length()){
            char ch = s.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);
            

            if(map.size() == end-start+1){
               maxLen = Math.max(maxLen, end-start+1);

            }else if(map.size()<end-start+1){
                while(map.size()<end-start+1){
                    char left = s.charAt(start);
                    map.put(left,map.get(left)-1);
                    if(map.get(left)==0){
                        map.remove(left);
                    }
                    start++;
                }
            }

            
            end++;
        }

        return maxLen;

        // int ans = 0;
        // int i = 0;
        // while(i<s.length()){
        //     char ch = s.charAt(i);
        //     if(!map.containsKey(ch)){
        //         s1=s1+ch;
        //         map.put(ch,1);
        //         i++;
        //     }else{
        //         int temp = s1.length();
        //         map.remove(ch);
        //         s1 ="";
        //         ans = Math.max(ans,temp);
                
                
        //     }
        // }
        // ans = Math.max(ans,s1.length());
        // return ans;
    }
}