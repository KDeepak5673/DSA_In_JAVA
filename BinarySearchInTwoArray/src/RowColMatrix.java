import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        int target = 3;

        int[] ans = Ans(array,target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] Ans(int[][] array, int tar){

        int row = 0;
        int col = array.length - 1;

        while(row < array.length && col >= 0){
            if(array[row][col] == tar){
                return new int[]{row ,col };
            }
            else if(array[row][col] > tar){
                col--;
            }
            else{
                row++;
            }
        }


        return new int[]{-1,-1};
    }
}