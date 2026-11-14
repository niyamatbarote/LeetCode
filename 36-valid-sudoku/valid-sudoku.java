class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Checking for all Horizontal Lines :
        for(int i = 0; i<9; i++) {
            Set<Character> set = new HashSet<>();
            for(int j = 0; j<9; j++) {
                // If '.' Null is Present SKIP/Continue :
                if(board[i][j] == '.') {
                    continue;
                }
                if(set.contains(board[i][j])) {
                    return false;
                }
                set.add(board[i][j]);
            }
        }

        // Checking for all Vertical Lines :
        for(int i =0; i<9; i++) {
            Set<Character> set = new HashSet<>();
            for(int j = 0; j<9; j++){
                // If '.' Null is Present SKIP/Continue :
                if(board[j][i] == '.') {
                    continue;
                }
                if(set.contains(board[j][i])) {
                    return false;
                }
                set.add(board[j][i]);
            }
        }

        // Checking for 3x3 Cube Boxes :
        for(int row = 0; row<9; row += 3) {
            for(int col = 0; col<9; col += 3) {
                Set<Character> set = new HashSet<>();
                for(int i =0; i<3; i++) {
                    for(int j =0 ; j<3; j++) {
                        // If '.' Null is Present SKIP/Continue :
                        if(board[row+i][col+j] == '.') {
                            continue;
                        }
                        if(set.contains(board[row+i][col+j])) {
                            return false;
                        }
                        set.add(board[row+i][col+j]);
                    }
                }
            }
        }

        return true;
    }
}
