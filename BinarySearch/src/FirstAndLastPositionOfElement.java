import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};

        int target = 6;

        int[] ans = Solution(arr , target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] Solution(int[ ] array , int tar){

        int[] Answer = {-1 , -1 };

        int startIndex = search(array , tar , true);
        int LastIndex = search(array , tar , false);

        Answer[0] = startIndex;
        Answer[1] = LastIndex;

        return Answer;


    }

    static int search(int[] array , int tar , boolean FindStartIndex){

        int ans = -1;

        int start = 0 ;
        int end = array.length - 1 ;

        while(start <= end ){
            int mid = start + (end - start)/2 ;

            if(array[mid] == tar){
                ans = mid;
                if(FindStartIndex){
                    end = mid -1 ;
                }else{
                    start = mid + 1;
                }

            }else if(array[mid] > tar){
                end = mid - 1;

            }else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
