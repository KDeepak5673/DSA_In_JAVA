public class CountZero {

    public static void main(String[] args) {
        int n = 104040;

        System.out.println(n);

        int ans = count(n);

        System.out.println(ans);
    }

    static int count(int n) {
        return helper(n , 0);

    }

    static int helper(int n , int count){

        if( n == 0){

            return count;
        }
        int rem = n % 10;

        if(rem == 0){
            return helper(n/10 , count+1);
        }
        return helper(n/10 , count);
    }


}
