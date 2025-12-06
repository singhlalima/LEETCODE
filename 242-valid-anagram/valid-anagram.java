class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            if (!map.containsKey(ch)) {
                count--;

            } else {
                count++;
            }

            if (map.containsKey(ch) && map1.containsKey(ch)) {
                if (map.get(ch) < map1.get(ch)) {
                    return false;
                }
            }
        }

        if (count == s.length())
            return true;
        else
            return false;
    }
}