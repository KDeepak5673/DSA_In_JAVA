public class FindPositionInInfiniteNumbers {
    public static void main(String[] args) {

        int[] array = {3,5,7,9,10,90,100,130,140,160,170};

        int target = 10;

        int ans = Ans(array , target);

        System.out.println(ans);
    }

    static int Ans(int[] array , int target){
        int start = 0;
        int end = 1;

        while (target > array[end] ){
            int newStart = end+1;
            end  = end + (end - start + 1)*2;

            start = newStart;
        }

        return Solution(array , target , start , end);
    }

    static int Solution(int[ ] array , int tar , int start , int end ){



        while(start <= end ){
            int mid = start + (end - start)/2 ;

            if(array[mid] == tar){
                return mid;

            }else if(array[mid] > tar){
                end = mid - 1;

            }else {
                start = mid + 1;
            }
        }

        return -1;

    }
}
