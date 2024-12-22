public class FloorOfANumber {

    //Floor = greatest number smaller or equal to target

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        int target = 17;

        int ans = Solution(arr , target);

        System.out.println(ans);
    }

    static int Solution(int[ ] array , int tar){

        if(tar < array[0]){
            return -1;
        }

        int start = 0 ;
        int end = array.length - 1 ;

        while(start <= end ){
            int mid = start + (end - start)/2 ;

            if(array[mid] == tar){
                return array[mid];

            }else if(array[mid] > tar){
                end = mid - 1;

            }else {
                start = mid + 1;
            }
        }

        return array[end];

    }
}