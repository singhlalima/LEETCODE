class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int five = 0;
        int ten = 0;
        for(int i = 0; i<n;i++){
            if(bills[i]-5==0){
                five += 1;
            }
            else if(bills[i]-5==5){
                ten+=1;
                five-=1;
            }else if(bills[i]-5==15){
                if((five>0) && (ten>0)){
                    five--;
                    ten--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        if(five>=0 && ten>=0)
        return true;
        else return false;
        
    }
}