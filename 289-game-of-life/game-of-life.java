class Solution {
    public void gameOfLife(int[][] board) {

        int n = board.length;
        int m = board[0].length;

        int[][] ans = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                int c2 = 0;   // live neighbors (RESET for each cell)

                // right
                if(j + 1 < m && board[i][j + 1] == 1) c2++;

                // left
                if(j - 1 >= 0 && board[i][j - 1] == 1) c2++;

                // up
                if(i - 1 >= 0 && board[i - 1][j] == 1) c2++;

                // down
                if(i + 1 < n && board[i + 1][j] == 1) c2++;

                // top-right
                if(i - 1 >= 0 && j + 1 < m && board[i - 1][j + 1] == 1) c2++;

                // top-left
                if(i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 1) c2++;

                // bottom-right
                if(i + 1 < n && j + 1 < m && board[i + 1][j + 1] == 1) c2++;

                // bottom-left
                if(i + 1 < n && j - 1 >= 0 && board[i + 1][j - 1] == 1) c2++;

                // rules
                if(board[i][j] == 1 && c2 < 2)
                    ans[i][j] = 0;
                else if(board[i][j] == 1 && (c2 == 2 || c2 == 3))
                    ans[i][j] = 1;
                else if(board[i][j] == 1 && c2 > 3)
                    ans[i][j] = 0;
                else if(board[i][j] == 0 && c2 == 3)
                    ans[i][j] = 1;
                else
                    ans[i][j] = 0;
            }
        }

        // copy result back to board
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                board[i][j] = ans[i][j];
            }
        }
    }
}
