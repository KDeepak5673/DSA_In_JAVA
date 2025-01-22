public class ith_bit {
    public static void main(String[] args) {

        int n = 183;

        System.out.println("ith bit : " + ithbit(n , 7));

        System.out.println("set ith bit :" +  setbit(n, 4));

        System.out.println("Reset ith bit : " + resetbit(n , 5));


    }
    private static int resetbit(int n, int i) {

        int ans = (n & (~(1<<(i-1))));

        return ans;
    }

    private static int setbit(int n, int i) {

        int ans = (n | (1<<(i-1)));

        return ans;
    }

    private static int ithbit(int n, int i) {

        int ans = (n & (1 << (i-1)))>> i-1;;

        return ans;
    }
}
