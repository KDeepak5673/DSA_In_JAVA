public class nQueen {
    public static void main(String[] args) {

        int n = 5;

        boolean[][] board = new boolean[n][n];

        int ans = queen(board, 0);

        System.out.println(ans);

    }

    static int queen(boolean[][] board, int row) {

        //Base condition to display the answers
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        //placing the queen and checking every row and col
        for (int i = 0; i < board.length; i++) {
            //place the queen if it is safe
            if (isSafe(board, row, i)) {
                board[row][i] = true;
                count += queen(board, row + 1);
                board[row][i] = false;
            }

        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int i) {

        //check vertical row
        for (int j = 0; j < row; j++) {
            if (board[j][i]) {
                return false;
            }
        }
        //diagonal left
        int maxLeft = Math.min(row, i);
        for (int j = 1; j <= maxLeft; j++) {
            if (board[row - j][i-j]) {
                return false;
            }
        }
        //diagonal right
        int maxRight = Math.min(row, board.length - i - 1);
        for (int j = 1; j <= maxRight; j++) {
            if (board[row - j][i + j]) {
                return false;
            }
        }

        return true;

    }


    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean elment : row) {
                if (elment) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }

            System.out.println();

        }
    }

}