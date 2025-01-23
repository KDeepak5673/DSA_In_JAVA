public class SquareRoot {

    public static void main(String[] args) {
        int n = 80;

        int p = 3 ;

        int ans1 = brute(n);

        System.out.println("Brute : " + ans1);


        double ans2 = WithBinarySearch(n , p);

        System.out.println( "Binary Search : " +  ans2);
    }

    private static int brute(int n) {

        //Only for Perfect Squrt root

        for(int i = 0 ; i*i <= n ; i++){

            if((i*i) == n){
                return i;
            }

        }

        return -1;
    }

    static double WithBinarySearch(int n , int p){

        int start = 0 ;
        int end = n;

        double ans  = 0.0;

        while (start <= end){

            int mid = start + (end - start)/2;

            if(mid*mid == n){

                ans = mid;
            }if(mid*mid > n){
                end  =  mid -1;
            }else{
                start  = mid + 1;

            }
        }

        double inc = 0.1;

        for (int i = 0 ; i < p ; i++){

            while(ans*ans <= n) {
                ans += inc;
            }

            ans -= inc;
            inc /= 10;

        }

        return ans;
    }
}
