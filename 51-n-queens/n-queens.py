class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        result = []
        board = [['.' for _ in range(n)] for _ in range(n)]
        
        def isvalid(row, col, board, n):
            for i in range(n):
                if board[i][col] == 'Q':
                    return False
                if row-i>=0 and col-i>=0 and board[row-i][col-i]=='Q':
                    return False
                if row-i>=0 and col+i<n and board[row-i][col+i]=='Q':
                    return False
                if row+i<n and col+i<n and board[row+i][col+i]=='Q':
                    return False
                if row+i<n and col-i>=0 and board[row+i][col-i]=='Q':
                    return False
            return True

        def backtrack(row):
            if row == n:
                solution = [''.join(r) for r in board]
                result.append(solution)
                return
            for col in range(n):
                if isvalid(row, col, board, n):
                    board[row][col] = 'Q'
                    backtrack(row + 1)
                    board[row][col] = '.'

        backtrack(0)
        return result