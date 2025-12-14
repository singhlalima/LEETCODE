class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i = 0;
        List<List<Integer>> list = new ArrayList<>();
        
        while(i<n){
            if(intervals[i][1]<newInterval[0]){
                List<Integer> temp = new ArrayList<>();
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                list.add(temp);
                i++;
            }else{
                break;
            }
            
        }
        int minStart = newInterval[0];
        int maxEnd = newInterval[1];
        while(i<n){
            if(intervals[i][0]<=maxEnd){
                 minStart = Math.min(minStart,intervals[i][0]);
                 maxEnd = Math.max(maxEnd,intervals[i][1]);
                 i++;
            }else{
                break;
            }
            
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(minStart);
        temp.add(maxEnd);
        list.add(temp);

        while(i<n){
            List<Integer> temp1 = new ArrayList<>();
          
            temp1.add(intervals[i][0]);
            temp1.add(intervals[i][1]);
            list.add(temp1);
            i++;
        }
        
        int[][] ans = new int[list.size()][2];
        for (int j = 0; j < list.size(); j++) {
            ans[j][0] = list.get(j).get(0);
            ans[j][1] = list.get(j).get(1);
        }
        return ans;
    }
}