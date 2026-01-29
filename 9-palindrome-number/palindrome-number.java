class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        if (x < 0) return false;

        // Store original number
        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            
            // Build reversed number
            reversed = reversed * 10 + digit;
            
            x = x / 10;
        }

        // Compare original and reversed
        return original == reversed;
    }
}
