class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length();
        String ans="";
        StringBuilder sb = new StringBuilder("");
        for(int i =n-1;i>=0;i-- ){
            
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }
            else{
                String reversed = sb.reverse().toString();
                if(reversed.length()>0){
                    ans = ans+reversed+" ";
                    sb.setLength(0);
                }
                
            }
        }
        for (int i = 0; i<n;i++){
            if(s.charAt(i)!=' '){
                ans += s.charAt(i);
            }
            else{
                break;
            }
        }
        return ans;
        
    }
}