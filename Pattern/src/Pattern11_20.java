public class Pattern11_20 {

    public static void main(String[] args) {

        System.out.println("Pattern 11");
        pattern11(5);
        System.out.println("Pattern 12");
        pattern12(5);
        System.out.println("Pattern 13");
        pattern13(5);
        System.out.println("Pattern 14");
        pattern14(5);
        System.out.println("Pattern 15");
        pattern15(5);
        System.out.println("Pattern 16");
        pattern16(5);
        System.out.println("Pattern 17");
        pattern17(5);
        System.out.println("Pattern 18");
        pattern18(5);
        System.out.println("Pattern 19");
        pattern19(5);
        System.out.println("Pattern 20");
        pattern20(5);




    }

    static void pattern11(int n){
        for (int i = 1; i <= n; i++) {

            int noOfSpaces = i;
            for (int j = 1; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int i = 1; i <= 2*n; i++) {

            int noOfSpaces = n<i ? 2*n-i+1 : i;
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }
            int tatalColInRow = n<i ? i-n : n-i+1 ;
            for (int j = 1; j <= tatalColInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("* ");

            for (int j = 2; j < (i-1)*2; j++) {
                System.out.print(" ");
            }

            int After = i > 1 ? 2 : 1;
            for (int j = 1; j < After; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int j = 1; j < 2*n; j++) {
            System.out.print("*");


        }
        System.out.println();
    }
    static void pattern14(int n){
        for (int j = 1; j < 2*n; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("* ");

            for (int j = 2; j < 2*(n-i); j++) {
                System.out.print(" ");
            }

            int After = i >n-1 ? 1 : 2;
            for (int j = 1; j < After; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for (int i = 1; i < 2*n-1 ; i++) {

            int spaceBefore = n >= i ? n-i : i-n ;
            for (int j = 1; j <= spaceBefore; j++) {
                System.out.print(" ");
            }
            System.out.print("* ");

            int spaceAfter = n >= i ? (i-1)*2 : 2*(2*n-i-1);
            for (int j = 2; j < spaceAfter; j++) {
                System.out.print(" ");
            }

            int After = i > 1 ? 2 : 1;
            for (int j = 1; j < After; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
        for (int i = 1; i < n; i++) {
            System.out.print(" ");

        }
        System.out.println("* ");



    }
    static void pattern16(int n){
        for (int i = 1 ; i <= n; i++) {


            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            int value = 1;

            for (int j = 1 ; j <= i; j++) {

                System.out.print(value + " ");
                value = value*(i-j)/j;
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern18(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern19(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern20(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}