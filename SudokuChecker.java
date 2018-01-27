import java.util.ArrayList;

/**
 * Created by rishabh anand on 1/10/2017.
 */
public class SudokuChecker {
    public static boolean isValidSudoku(char[][] board) {
        //check each column and box
        for (int i = 1; i <= 9; i++) {
            if (!checkBox(board, i)) {
                return false;
            }
            if (!checkColumn(board, i)) {
                return false;
            }
        }
        //check each row
        for (char[] c: board) {
            if (!checkRow(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkBox(char[][] board, int box) {
        ArrayList<Integer> freq = new ArrayList<>();
        if (box == 1) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != '.') {
                        int temp = (int) board[i][j];
                        if (freq.contains(temp)) {
                            return false;
                        }
                        freq.add(temp);
                    }
                }
            }
        }
        else if (box == 2) {
            for (int i = 0; i < 3; i++) {
                for (int j = 3; j < 6; j++) {
                    if (board[i][j] != '.') {
                        int temp = (int) board[i][j];
                        if (freq.contains(temp)) {
                            return false;
                        }
                        freq.add(temp);
                    }
                }
            }
        }
        else if (box == 3) {
            for (int i = 0; i < 3; i++) {
                for (int j = 6; j < 9; j++) {
                    if (board[i][j] != '.') {
                        int temp = (int) board[i][j];
                        if (freq.contains(temp)) {
                            return false;
                        }
                        freq.add(temp);
                    }
                }
            }
        }
        else if (box == 4) {
            for (int i = 3; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != '.') {
                        int temp = (int) board[i][j];
                        if (freq.contains(temp)) {
                            return false;
                        }
                        freq.add(temp);
                    }
                }
            }
        }
        else if (box == 5) {
            for (int i = 3; i < 6; i++) {
                for (int j = 3; j < 6; j++) {
                    if (board[i][j] != '.') {
                        int temp = (int) board[i][j];
                        if (freq.contains(temp)) {
                            return false;
                        }
                        freq.add(temp);
                    }
                }
            }
        }
        else if (box == 6) {
            for (int i = 3; i < 6; i++) {
                for (int j = 6; j < 9; j++) {
                    if (board[i][j] != '.') {
                        int temp = (int) board[i][j];
                        if (freq.contains(temp)) {
                            return false;
                        }
                        freq.add(temp);
                    }
                }
            }
        }
        else if (box == 7) {
            for (int i = 6; i < 9; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != '.') {
                        int temp = (int) board[i][j];
                        if (freq.contains(temp)) {
                            return false;
                        }
                        freq.add(temp);
                    }
                }
            }
        }
        else if (box == 8) {
            for (int i = 6; i < 9; i++) {
                for (int j = 3; j < 6; j++) {
                    if (board[i][j] != '.') {
                        int temp = (int) board[i][j];
                        if (freq.contains(temp)) {
                            return false;
                        }
                        freq.add(temp);
                    }
                }
            }
        }
        else {
            for (int i = 6; i < 9; i++) {
                for (int j = 6; j < 9; j++) {
                    if (board[i][j] != '.') {
                        int temp = (int) board[i][j];
                        if (freq.contains(temp)) {
                            return false;
                        }
                        freq.add(temp);
                    }
                }
            }
        }
        return true;
    }

    private static boolean checkRow(char[] row) {
        ArrayList<Integer> freq = new ArrayList<>();
        for (char c: row) {
            if (c != '.') {
                int temp = (int) c;
                if (freq.contains(temp)) {
                    return false;
                }
                freq.add(temp);
            }
        }
        return true;
    }

    private static boolean checkColumn(char[][] board, int column) {
        ArrayList<Integer> freq = new ArrayList<>();
        for (char[] c: board) {
            if (c[column - 1] != '.') {
                int temp = (int) c[column - 1];
                if (freq.contains(temp)) {
                    return false;
                }
                freq.add(temp);
            }
        }
        return true;
    }

    public static void main(String[] args){
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                          {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                          {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                          {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                          {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                          {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                          {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                          {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                          {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }
}
