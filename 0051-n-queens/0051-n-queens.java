import java.util.*;

class Solution {
    List<List<String>> result;

    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Filling the board initially with empty cells.
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<int[]> queens = new ArrayList<>();
        dfs(board, 0, queens);

        return result;
    }

    private void dfs(char[][] board, int r, List<int[]> queens) {
        // Check if all rows are placed.
        if (board.length == queens.size()) {
            List<String> rows = new ArrayList<>();
            for (char[] row : board) { // Fixed iteration
                rows.add(new String(row));
            }
            result.add(rows);
            return; // Ensure backtracking stops when a solution is found
        }

        // Try placing queens in each column of row 'r'
        for (int c = 0; c < board.length; c++) {
            if (canAddQueen(r, c, queens)) {
                board[r][c] = 'Q';
                queens.add(new int[]{r, c});
                dfs(board, r + 1, queens);
                board[r][c] = '.';
                queens.remove(queens.size() - 1);
            }
        }
    }

    private boolean canAddQueen(int r, int c, List<int[]> queens) { // Fixed return type
        for (int[] q : queens) {
            int dx = Math.abs(r - q[0]);
            int dy = Math.abs(c - q[1]);

            if (dx == 0 || dy == 0 || dx == dy) { // Same row, column, or diagonal
                return false;
            }
        }
        return true;
    }
}
