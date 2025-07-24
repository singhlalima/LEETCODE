class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = 0;
        int c1 = 0;
        int c2 = 0;

        while (j < sb.length()) {
            if (sb.charAt(j) == '(') {
                c1++;
            } else {
                c2++;
            }

            if (c1 == c2) {
                
                sb.deleteCharAt(j);   
                sb.deleteCharAt(i);  
                
                j = j - 2; 
                i = j + 1; 
                c1 = 0;
                c2 = 0;
            }
            j++;
        }

        return sb.toString();
    }
}
