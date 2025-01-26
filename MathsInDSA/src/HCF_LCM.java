public class HCF_LCM {

    public static void main(String[] args) {

        int a = 9;

        int b = 18;

        System.out.println("The Gcd of a and b is " + gcd(a, b ));

        System.out.println("The LCM of a and b is " + lcm(a, b ));




    }

    private static int lcm(int a, int b) {

        return (a*b)/gcd(a,b);
    }

    static int gcd(int a, int b ){

        if(a == 0){
            return b;
        }

        return gcd(b%a , a);
    }
}
