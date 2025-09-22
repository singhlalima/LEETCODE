class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) return true;

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c)); // directly lowercase here
            }
        }

        String cleaned = sb.toString();
        String reversed = sb.reverse().toString(); // reverse AFTER saving cleaned
        return cleaned.equals(reversed);
    }
}
