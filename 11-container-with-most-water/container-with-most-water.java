class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int area = Integer.MIN_VALUE;
        int i = 0;
        int j = n-1;
        if(n==2){
            if(height[i]<=height[j]) return height[i];
            else return height[j];
        }
        while(i<j){
            if(height[i]<=height[j]){
                 area = Math.max(area, (height[i]*(j-i)));
                 i++;
            }else{
                area = Math.max(area, (height[j]*(j-i)));
                j--;
            }
        }
        return area;
        
    }
}