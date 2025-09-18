class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        String ans = "";
        if (n<=numRows) return s;
        if(numRows == 1) return s;
        for(int i = 0; i<numRows; i++){
           
            int idx = i;
            ans += s.charAt(i);
            int add = ((numRows-i)*2)-2;
            int var = i*2;
            if(i==numRows-1) add = (numRows*2)-2;
            
            while(idx<n){
                idx += add;
                if(idx<n)ans += s.charAt(idx);
                
                if(i!=0 && i!=numRows-1){
                idx += var;
                if(idx<n)
                ans += s.charAt(idx);}
            }
                
                
        }
            
    return ans;
        
    }
    }