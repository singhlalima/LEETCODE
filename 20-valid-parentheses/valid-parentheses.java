import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push onto stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // If it's a closing bracket, check matching
            else {
                if (stack.isEmpty()) return false; // No opening bracket
                
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        // If stack is empty -> valid
        return stack.isEmpty();
    }
}
