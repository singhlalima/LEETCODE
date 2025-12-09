class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int n = words.length;
        int m = words[0].length();
        int k = m*n;
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(int i = 0; i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        
        for(int idx = 0; idx<m;idx++){
            map2.clear();
            int count = 0;
            int start = idx;
            for(int end = idx; end<=s.length()-m;end+=m){
                String word = s.substring(end,end+m);
                if(!map.containsKey(word)){
                     map2.clear();
                     count = 0;
                     start = end+m;
                     continue;
                }

                map2.put(word, map2.getOrDefault(word, 0) + 1);
                count++;

                while(map2.get(word)>map.get(word)){
                    String leftWord = s.substring(start,start+m);
                    map2.put(leftWord,map2.get(leftWord)-1);
                    if(map2.get(leftWord)==0){
                        map2.remove(leftWord);
                        
                    }
                    start +=m;
                    count--;
                    
                }

                if(count==n) ans.add(start);
            }
        }
        return ans;
        

    }
}