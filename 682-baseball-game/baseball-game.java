class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<String> s = new Stack<>();

        for (int i = 0; i < n; i++) {

            try {
                
                Integer.parseInt(operations[i]);
                s.push(operations[i]);
            } 
            catch (NumberFormatException e) {
             
                
                if (operations[i].equals("C")) {
                    s.pop();
                } 
                else if (operations[i].equals("D")) {
                    String prev = s.pop();
                    int temp = 2 * Integer.valueOf(prev);
                    s.push(prev);
                    s.push(String.valueOf(temp));
                } 
                else {  // "+"
                    String num = s.pop();
                    String num1 = s.peek();
                    int sum = Integer.valueOf(num) + Integer.valueOf(num1);
                    s.push(num);
                    s.push(String.valueOf(sum));
                }
            }
        }

        int ans = 0;
        while (!s.isEmpty()) {
            ans += Integer.valueOf(s.pop());
        }

        return ans;
    }
}
