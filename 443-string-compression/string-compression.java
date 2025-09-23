class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int j = 0; 
        int count = 1;

        for (int i = 0; i < n; i++) {
            
            if (i < n - 1 && chars[i] == chars[i + 1]) {
                count++;
            } else {
                
                chars[j++] = chars[i];
                
                if (count > 1) {
                    String cnt = String.valueOf(count);
                    for (int k = 0; k < cnt.length(); k++) {
                        chars[j++] = cnt.charAt(k);
                    }
                }
                count = 1; 
            }
        }

        return j; 
    }
}
