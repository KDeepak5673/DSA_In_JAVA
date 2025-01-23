public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 00;


        boolean ans = (n & (n-1)) ==0 ;

        if(n == 0){
            ans = false;
        }

        System.out.println(ans);
    }
}
