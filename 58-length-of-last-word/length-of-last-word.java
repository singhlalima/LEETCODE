class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        ArrayList<String> arr = new ArrayList<>();
        String s1 = "";
    
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                if (!s1.isEmpty()) {     // word finished
                    arr.add(s1);
                    s1 = "";
                }
            } else {
                s1 += c;                 // build word
            }
        }

        // Add last word if it exists
        if (!s1.isEmpty()) {
            arr.add(s1);
        }

        if (arr.isEmpty()) return 0;     // no words found
        String ans = arr.get(arr.size() - 1);  // last word
        return ans.length();
    }
}
