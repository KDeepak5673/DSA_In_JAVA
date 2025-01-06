public class Main {
    public static void main(String[] args) {

        System.out.println("Pattern 1");
        pattern1(5);
        System.out.println("Pattern 2");
        pattern2(5);
        System.out.println("Pattern 3");
        pattern3(5);
        System.out.println("Pattern 4");
        pattern4(5);
        System.out.println("Pattern 5");
        pattern5(5);
        System.out.println("Pattern 6");
        pattern6(5);
        System.out.println("Pattern 7");
        pattern7(5);
        System.out.println("Pattern 8");
        pattern8(5);
        System.out.println("Pattern 9");
        pattern9(5);
        System.out.println("Pattern 10");
        pattern10(5);




    }

    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n - i +1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ")  ;

            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 1; i < 2*n; i++) {
            int totalColInRow = i > n ? 2*n-i : i;
            for (int j = 1; j <= totalColInRow; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2*n; j >= 2*i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern10(int n){
        for (int i = 1; i <= n; i++) {

            int noOfSpaces =  n-i;
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }

            int totalColInRow =  i;
            for (int j = 1; j <= totalColInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}