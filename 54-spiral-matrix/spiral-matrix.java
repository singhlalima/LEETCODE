class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;        // total rows
        int n = matrix[0].length;     // total columns

        int sr = 0, sc = 0;           // starting row & col
        int er = m - 1, ec = n - 1;   // ending row & col

        while (sr <= er && sc <= ec) {

            // Traverse top row (left → right)
            for (int j = sc; j <= ec; j++) {
                ans.add(matrix[sr][j]);
            }
            sr++;

            // Traverse right column (top → bottom)
            for (int i = sr; i <= er; i++) {
                ans.add(matrix[i][ec]);
            }
            ec--;

            // Traverse bottom row (right → left)
            if (sr <= er) {
                for (int j = ec; j >= sc; j--) {
                    ans.add(matrix[er][j]);
                }
                er--;
            }

            // Traverse left column (bottom → top)
            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    ans.add(matrix[i][sc]);
                }
                sc++;
            }
        }

        return ans;
    }
}
