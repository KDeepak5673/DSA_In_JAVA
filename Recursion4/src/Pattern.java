public class Pattern {

    public static void main(String[] args) {
        Triangle2(4, 0);
    }

    static void Triangle(int row , int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("*");
            Triangle(row, col+1);
        }else{
            System.out.println();
            Triangle(row-1,0);
        }
    }
    static void Triangle2(int row , int col){
        if(row == 0){
            return;
        }
        if(col < row){
            Triangle2(row, col+1);
            System.out.print("*");

        }else{
            Triangle2(row-1,0);
            System.out.println();

        }


    }
}
