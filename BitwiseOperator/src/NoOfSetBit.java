public class NoOfSetBit {
    public static void main(String[] args) {

        int n = 7 ;

        int ans = 0;

        System.out.println(Integer.toBinaryString(n));

        while (n > 0){
            n -=  n & (-n);

            ans++;

        }

        System.out.println(ans);

    }
}
