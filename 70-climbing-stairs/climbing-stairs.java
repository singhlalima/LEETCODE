class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int ans[] = new int[n+1];
        int m = ans.length;
        int a = 1;
        int b = 1;
        int j = m-3;
        while(n>1){
            ans[j] = a+b;
            a =b;
            b=ans[j];
            n--;
            j--;
        }
        return ans[0];
        
    }
}