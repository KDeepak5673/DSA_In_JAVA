public class factorialOfNumber {
    public static void main(String[] args) {

        int ans = factorial(6);

        System.out.println(ans);

    }

    static int factorial(int n){

        if(n <= 1){
            return 1;
        }

        return n * factorial(n-1);



    }
}
