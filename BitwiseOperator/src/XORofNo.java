public class XORofNo {
    public static void main(String[] args) {
        int n = 8;

        int ans = 0;
        int no = 0;

        while (no < n){
            ans = ans^no;

            no += 1;

            System.out.println(ans);

        }
        /*
        Observations

        if (n % 4 = 0)
        then a
        if (n % 4 = 1)
        then 1
        if (n % 4 = 2)
        then a+1
        if (n % 4 = 3)
        then 0


        */
    }
}
