public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8 ,1, 2,3};

        System.out.println(search(arr , 9 , 0 , arr.length));


    }
    static int search(int[] arr , int tar , int s , int e){

        if(s<e){
            return -1;
        }

        int m = s + (e-s)/2 ;

        if(arr[m] == tar ){
            return m;
        }
        if(arr[s] <= arr[m]){

            if(tar >= arr[s] && tar <= arr[m]){
                search(arr , tar , s, m-1);
            }else {
                return search(arr ,tar , m+1 , e);
            }
        }
        if(tar >= arr[m] && tar <= arr[e]){
            return search(arr , tar , m+1 ,e);
        }
        return search(arr , tar, s, m-1);
    }
}
