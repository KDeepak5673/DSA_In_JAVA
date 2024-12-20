import java.util.Scanner;

public class BinarySearch_Basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        int length = sc.nextInt();

        int[] input = new int[length];


        for(int i = 0 ; i < length ; i++){
            System.out.print("Enter the " + (i+1) + " number : ");
            input[i] = sc.nextInt();
        }

        System.out.print("Enter the target element : " );
        int target  = sc.nextInt();

        int ans = BinarySearch(input , target);

        System.out.println("The ans is " + ans);

    }

    static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length -1 ;

        while(start <= end){

            int mid = start + (end - start)/ 2;

            //if target is less than middle element than have to search on left so have to end = mid -1
            if(target < arr[mid]){
                end = mid - 1;

            }

            //if target is greater than middle element have to search on right side so the start changes from mid + 1
            else if(target > arr[mid] ){
                start  =  mid + 1 ;

            }



            // if target == mid then this is  the ans
            else{
                return mid;
            }
        }
        return  -1;
    }
}