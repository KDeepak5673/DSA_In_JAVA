import java.util.Arrays;

public class IncludeAllPath {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[maze.length][maze[0].length];

//        allPath("" , maze , 0,0);
        allPathPrint("" , maze , 0,0 , path , 1);

    }
    static void allPath(String p , boolean[][] maze , int r, int c){

        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c] ){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length-1){
            allPath(p + 'D' , maze,r+1 , c);

        }
        if(c <  maze[0].length-1){
            allPath(p + 'R' ,maze , r , c+1);

        }
        if(c >  0){
            allPath(p + 'L' ,maze , r , c-1);

        }
        if(r >  0){
            allPath(p + 'U' ,maze , r-1 , c);
        }
        maze[r][c] = true;
    }

    static void allPathPrint(String p , boolean[][] maze , int r, int c , int[][] path , int step){

        if(r == maze.length-1 && c == maze[0].length-1){

            path[r][c] = step;

            for(int[] x : path){
                System.out.println(Arrays.toString(x));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c] ){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1){
            allPathPrint(p + 'D' , maze,r+1 , c , path ,step+1);

        }
        if(c <  maze[0].length-1){
            allPathPrint(p + 'R' ,maze , r , c+1 , path ,step+1);

        }
        if(c >  0){
            allPathPrint(p + 'L' ,maze , r , c-1 , path ,step+1);

        }
        if(r >  0){
            allPathPrint(p + 'U' ,maze , r-1 , c , path ,step+1);

        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
