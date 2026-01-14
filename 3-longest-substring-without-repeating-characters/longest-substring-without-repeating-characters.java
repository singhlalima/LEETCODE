class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0;
        int maxLen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int end = 0; end<n;end++){
            char ch = s.charAt(end);
            
            map.put(ch,map.getOrDefault(ch,0)+1);

            if(map.size()==end-start+1){
                maxLen = Math.max(maxLen,end-start+1);
            }else{
                while(map.size()<end-start+1){
                    char left = s.charAt(start);
                    map.put(left,map.get(left)-1);
                    if(map.get(left)==0){
                    map.remove(left);
                    }
                    start ++;
                }
            }
        }

        return maxLen;
    }
}