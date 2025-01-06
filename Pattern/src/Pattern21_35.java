public class Pattern21_35 {

    public static void main(String[] args) {

        System.out.println("Pattern 21");
        pattern21(5);
        System.out.println("Pattern 22");
        pattern22(5);
        System.out.println("Pattern 23");
        pattern23(5);
        System.out.println("Pattern 24");
        pattern24(5);
        System.out.println("Pattern 25");
        pattern25(5);
        System.out.println("Pattern 26");
        pattern26(5);
        System.out.println("Pattern 27");
        pattern27(5);
        System.out.println("Pattern 28");
        pattern28(5);
        System.out.println("Pattern 29");
        pattern29(5);
        System.out.println("Pattern 30");
        pattern30(5);
        System.out.println("Pattern 31");
        pattern31(4);
        System.out.println("Pattern 32");
        pattern32(5);
        System.out.println("Pattern 33");
        pattern33(5);
        System.out.println("Pattern 34");
        pattern34(5);
        System.out.println("Pattern 35");
        pattern35(5);




    }

    static void pattern21(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern22(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern23(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n - i +1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern24(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ")  ;

            }
            System.out.println();
        }
    }
    static void pattern25(int n){
        for (int i = 1; i < 2*n; i++) {
            int totalColInRow = i > n ? 2*n-i : i;
            for (int j = 1; j <= totalColInRow; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    static void pattern26(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern27(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int i = 1; i <= 2*n; i++) {

            int totalColInRow = i > n ? 2*n-i : i;

            int noOfSpaces = i > n ? i-n : n-i;
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= totalColInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern29(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int i = 1; i <= n; i++) {

            int noOfSpaces = i > n ? i-n : n-i;
            for (int j = 0; j <= noOfSpaces; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){

        int Twon = 2*n-2;

        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {

                int a = Math.min(i,j);
                int b = Math.min(Twon-i , Twon-j);
                int atEveryIndex = n - Math.min(a, b);
                System.out.print(atEveryIndex + " ");

            }
            System.out.println();
        }
    }

    static void pattern32(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern33(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern34(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern35(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
