import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {4, 3,2, 1};

//        bubble(arr , arr.length-1, 0);
//
//        System.out.println(Arrays.toString(arr));

       selection(arr , arr.length, 0 , 0);

        System.out.println(Arrays.toString(arr));


    }
    static void bubble(int[] arr , int l , int c){

        if(l == 0){
            return;
        }
        if(c < l){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubble(arr , l , c+1);
        }else {
            bubble(arr, l-1 , 0);
        }
    }

    static void selection(int[] arr , int l , int c ,int max){
        if( l == 0){
            return;
        }

        if(c < l){
            if(arr[c] > arr[max]){
                selection(arr , l , c+1 ,c);
            }else {
                selection(arr , l , c+1 ,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[l-1];
            arr[l-1] = temp;

            selection(arr , l-1 ,0,0 );
        }

    }

}
