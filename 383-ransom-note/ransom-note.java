class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (!map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), 1);
            } else {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            }

        }
        int count = 0;
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.containsKey(ransomNote.charAt(i))) {
                count++;
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
                if (map.get(ransomNote.charAt(i)) == 0) {
                    map.remove(ransomNote.charAt(i));
                }
            }

        }
       
        if (count == ransomNote.length())
            return true;
        else
            return false;

    }

}