class Solution {
    public int minimumMoves(String s) {
        int  n = s.length();
        int moves = 0;
        int i = 0;
        while(i<n){
            if(s.charAt(i)=='X'){
                moves += 1;
                i+=3;
            }
            else{
                i+=1;
            }
        }
        return moves;
        
    }
}