class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        int start = 0;
        int count = 0;
        int minLength = Integer.MAX_VALUE;
        int required = map2.size();
        int bestStart = 0;
        
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            
            if (map2.containsKey(ch)) {
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
                if (map1.get(ch).intValue() == map2.get(ch).intValue()) count++;
                    
            }

            while(count == required){
                if(end-start+1<minLength){
                    minLength = end-start+1;
                    bestStart = start;
                    
                }

                char leftChar = s.charAt(start);
                start++;

                if(map2.containsKey(leftChar)){
                    map1.put(leftChar,map1.get(leftChar)-1);

                    if(map1.get(leftChar)<map2.get(leftChar)) count--;
                }
            }
        }

        if(minLength == Integer.MAX_VALUE) return "";
        else return s.substring(bestStart,bestStart+minLength);
    }
}