class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<10;i++){
            map.put(i,i*i);
        }
        while(n!=1){
            if(n==4) break;
            int a = n;
            int ans = 0;
            while(a!=0){
           int x= a%10;
            a= a/10;
            ans = ans + map.get(x);
            }
            n = ans;


        }

        if(n==1) return true;
        else return false;
        
    }
}