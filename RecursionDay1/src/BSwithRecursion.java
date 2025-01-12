public class BSwithRecursion {

    public static void main(String[] args) {
        int[] array = {1,3,4,6,7,8,9};

        int target = 7;

        int ans = search(array , target , 0 , array.length-1);

        System.out.println(ans);
    }
    static int search(int[] arr , int target , int s, int e){

        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2 ;

        if(arr[m] == target ){
            return m;
        }

        if(arr[m] > target ){
            return search(arr, target, s , m-1);
        }
        return search(arr, target, m+1 , e);

    }
}
