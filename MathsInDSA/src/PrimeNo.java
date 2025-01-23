public class PrimeNo {
    public static void main(String[] args) {

        int i = 20;

        for (int j = 1; j <= i; j++) {
            System.out.println(j + " " + isPrime(j));
        }

    }

    static boolean isPrime(int i){

        if(i == 1){
            return false;
        }

        int c = 2;

        while(c*c <= i){
            if(i % c == 0){
                return false;
            }

            c++;
        }

        return true;
    }
}