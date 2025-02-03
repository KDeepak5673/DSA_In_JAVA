public class sudukoSolver {
    public static void main(String[] args) {
        int[][] grid = {
                {8, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };


        if(solve(grid)){
            display(grid);
        }else {
            System.out.println("Cannot solve");
        }

        System.out.println("Second");
        if(solve(board)){
            display(board);
        }else {
            System.out.println("Cannot solve");
        }
    }
    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int elment : row) {
                System.out.print(elment + " ");
            }

            System.out.println();

        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft =  false;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }
        if(emptyLeft){
            return true;
        }
        
        //backtrack

        for (int i = 1; i <= 9; i++) {
            if(isSafe(board , row , col , i)){
                board[row][col] = i;
                if(solve(board)){
                    return true;
                }else {
                    board[row][col] = 0;
                }
            }
        }
        return false;

    }
    
    static boolean isSafe(int[][] board , int row , int col , int num){
        //check the row 
        for (int i = 0; i < board.length; i++) {
            //check for the no is in the row
            if(board[row][i] == num){
                return false;
            }
        }
        //check the col
        for(int [] nums : board){
            //check for the no is in the col
            if(nums[col] == num){
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;

        for (int i = rowStart; i < rowStart+sqrt; i++) {
            for (int j = colStart; j < colStart+sqrt; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        
        
        return true;
    }
    
    
    
}

