class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();

        int n = s.length();
        if (n == 0 || n == 1)
            return true;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else {
                continue;
            }
        }
        return sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase());

    }
}