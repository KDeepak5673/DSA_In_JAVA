import java.util.Scanner;

public class OrderAgonstcBS {
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

        int ans = OrderAgonstc(input , target);

        System.out.println("The ans is " + ans);
    }
    static int OrderAgonstc(int[] arr ,  int target){
        int start = 0;
        int end = arr.length -1 ;

        //finding the array is increasing or decreasing
        boolean isAsc = arr[start] < arr[end];



        while(start <= end){

            int mid = start + (end - start)/ 2;

            if (target == arr[mid]){
                return mid;
            }

            else if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if(target > arr[mid] ){
                    start  =  mid + 1 ;
                }

            }else{if(target > arr[mid]){
                end = mid - 1;
            }
            else if(target < arr[mid] ){
                start  =  mid + 1 ;
            }

            }
        }
        return  -1;
    }
}
