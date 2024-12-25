import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int target = 15;

        int[] ans = Ans(array,target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] Ans(int[][] array , int target){

        int rows = array.length;
        int cols = array[0].length;

        if(rows == 1 ){
            return BS(array , target,0, 0, cols-1);
        }

        int rStart = 0;
        int rEnd = cols - 1;
        int cMid = cols/2;

        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd - rStart)/2;

            if(array[mid][cMid] == target){
                return new int[]{mid , cMid};
            }
            else if(array[mid][cMid] > target){
                rEnd = mid - 1;
            }else{
                rStart = mid + 1;
            }
        }
        if(array[rStart][cMid] == target){
            return new int[]{rStart , cMid};
        }

        if(array[rStart + 1][cMid] == target){
            return new int[]{rStart+1 , cMid};
        }

        //1st half
        if(target <= array[rStart][cMid - 1]){
            return BS(array , target , rStart , 0, cMid-1);
        }
        //2nd half
        if(target >= array[rStart][cMid + 1] && target <= array[rStart][cols-1] ){
            return BS(array , target , rStart , cMid+1, cols);
        }
        //3rd half
        if(target <= array[rStart + 1][cMid - 1]){
            return BS(array , target , rStart+1 , 0, cMid-1);

        }
        //4th half
        if(target >= array[rStart + 1][cMid + 1] && target <= array[rStart + 1][cols-1]){
            return BS(array , target , rStart+1 , cMid+1, cols);

        }



        return new int[]{-1,-1};
    }

    static int[] BS(int[][] arr , int tar ,int row ,  int cStart, int cEnd ){

        while(cStart < cEnd){
            int mid = cStart + (cEnd - cStart)/2 ;

            if(arr[row][mid] == tar){
                return new int[]{row , mid};
            }else if(arr[row][mid] > tar){
                cStart = mid+1;
            }else{
                cEnd = mid -1;
            }
        }



        return new int[]{-1,-1};
    }
}
