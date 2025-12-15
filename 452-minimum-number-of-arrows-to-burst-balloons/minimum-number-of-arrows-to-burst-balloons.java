class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int finish = points[0][1];
        int count = 1;
        for(int i = 1; i<n;i++){
            if(points[i][0]>finish){
                count+=1;
                finish = points[i][1];
            }
        }

        return count;
    }
}