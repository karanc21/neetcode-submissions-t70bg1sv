class Solution {
    public boolean isValidSudoku(char[][] board) {

        // rows
        for (int i = 0; i < 9; i++) {
            boolean[] freq = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int num = c - '1';
                    if (freq[num]) return false;
                    freq[num] = true;
                }
            }
        }

        // columns
        for (int i = 0; i < 9; i++) {
            boolean[] freq = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (c != '.') {
                    int num = c - '1';
                    if (freq[num]) return false;
                    freq[num] = true;
                }
            }
        }

        // boxes
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                boolean[] freq = new boolean[9];

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[row + i][col + j];

                        if (c != '.') {
                            int num = c - '1';
                            if (freq[num]) return false;
                            freq[num] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
}