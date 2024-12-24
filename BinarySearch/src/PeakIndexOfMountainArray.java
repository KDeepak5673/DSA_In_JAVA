public class PeakIndexOfMountainArray {

    //Found Peak in array

    public static void main(String[] args) {
        int[] array = {0,1,2,3,5,3,0};

        int ans = Ans(array);

        System.out.println(ans);
    }

    static int Ans(int[] arr){
        int start = 0;
        int end = arr.length -1 ;

        while(start < end ){
            int mid = start + ( end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        if(start == end ){
            return start;
        }

        return -1;
    }
}
