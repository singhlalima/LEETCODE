class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n==1) return intervals;

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<List<Integer>> ans = new ArrayList<>();
        
        int i = 1;
        
        int minStart = intervals[0][0];
        int maxEnd = intervals[0][1];
        while(i<n){
            
            if(intervals[i][0]<=maxEnd){ 
               
               
                minStart = Math.min(minStart,intervals[i][0]);
                maxEnd = Math.max(maxEnd,intervals[i][1]);
                
            }else{
                List<Integer> temp = new ArrayList<>();
                temp.add(minStart);
                temp.add(maxEnd);
                ans.add(temp);
                maxEnd = intervals[i][1];
                minStart = intervals[i][0];
            }
            i++;
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(minStart);
        temp.add(maxEnd);
        ans.add(temp);
         
        int result[][] = new int[ans.size()][2];
        
        for(int j = 0; j<ans.size(); j++){
            result[j][0] = ans.get(j).get(0);
            result[j][1] = ans.get(j).get(1);
        }

        return result;
        
    }
}