package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
    boolean result = true;
        for (int i = 0; i < board.length; i++) {
        if ('X' != board[row][i]) {
            result = false;
            break;
        }
    }
        return result;
}

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
                if ('X' != board[i][j]) {
                    result = false;
                    break;
                }

            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            if ('X' == board[i][i]) {
                rsl[i] = board[i][i];
            }
        }
        return rsl;
    }
}
