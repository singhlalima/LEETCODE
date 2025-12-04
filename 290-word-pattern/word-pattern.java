import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // build arr1 from pattern characters (same as your code)
        Character arr1[] = new Character[pattern.length()];
        for (int i = 0; i < pattern.length(); i++) {
            arr1[i] = pattern.charAt(i);
        }

        // split s into words using your manual logic but into a dynamic list
        ArrayList<String> words = new ArrayList<>();
        String cur = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                cur = cur + s.charAt(i);
            } else {
                words.add(cur);
                cur = "";
            }
        }
        // add last word
        words.add(cur);

        // if number of words and pattern length mismatch -> false
        if (words.size() != pattern.length()) return false;

        // now apply bijection checks using two maps:
        // map from char -> word and map from word -> char (to ensure one-to-one)
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> rev = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            Character ch = arr1[i];
            String w = words.get(i);

            if (map.containsKey(ch)) {
                // existing mapping must match current word
                if (!map.get(ch).equals(w)) return false;
            } else {
                // if this word is already mapped to another char -> conflict
                if (rev.containsKey(w)) {
                    if (!rev.get(w).equals(ch)) return false;
                }
                // create new mapping in both directions
                map.put(ch, w);
                rev.put(w, ch);
            }
        }

        return true;
    }
}
