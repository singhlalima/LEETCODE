class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        if(n==1 && s.charAt(0) != '*') return false;
        
        int mini = 0;
        int maxi = 0;
        for(int i = 0; i<n;i++){
            if(s.charAt(i) == '('){
                mini +=1;
                maxi +=1;
            }else if(s.charAt(i) == ')'){
                mini -=1;
                maxi -=1;
            }else{
                mini -=1;
                maxi +=1;
            }

            if(mini<0) mini =0;
            if(maxi<0) return false;
        }

        if(mini==0) return true;
        return false;
    }
}