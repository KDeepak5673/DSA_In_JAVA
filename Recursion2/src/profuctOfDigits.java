public class profuctOfDigits {

    public static void main(String[] args) {

        int ans = prod(13);

        System.out.println(ans);

    }
    static int prod(int n ){

        if(n > 0){
            return (n%10) * prod(n/10);
        }

        return 1;
    }
}


