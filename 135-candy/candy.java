class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int count [] = new int[ratings.length];
        Arrays.fill(count,1);
        int sum = 0;
        // for(int i = 0; i<n; i++){
        //     if(ratings[i]==0){
        //         count[i+1] = 2;
        //         count[i-1] = 2 ;
        //     }
        // }
        for(int i = n-1; i>=1;i--){
            
            if (ratings[i]<ratings[i-1]){
                count[i-1] = count[i]+1;          }
        }
        for(int i = 0; i<n-1; i++){
            if (ratings[i]<ratings[i+1] && count[i+1]<=count[i]){
                count[i+1] = count[i] + 1;
            }
        }
        for(int i = 0; i<n;i++){
            sum+=count[i];
        }
        return sum;
    }
}