class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;

        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < m; j++) {
                char num = board[i][j];
                if (num != '.') {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                    if (map.get(num) > 1) {
                        flag1 = false;
                        break;
                    }

                }
            }

        }

        for (int j = 0; j < m; j++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                char num = board[i][j];
                if (num != '.') {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                    if (map.get(num) > 1) {
                        flag2 = false;
                        break;
                    }
                }
            }

        }

        for (int i = 0; i < n; i += 3) {
            for (int j = 0; j < m; j += 3) {

                HashMap<Character, Integer> map = new HashMap<>();

                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {
                        char num = board[r][c];
                        if (num != '.') {
                            map.put(num, map.getOrDefault(num, 0) + 1);
                            if (map.get(num) > 1) {
                                flag3 = false;
                                break;
                            }
                        }
                    }
                }

            }
        }

        if ((flag1 && flag2) && flag3)
            return true;
        else
            return false;
    }
}