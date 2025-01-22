import java.util.Scanner;

public class evenOnNot {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = Sc.nextInt();

        if((n & 1) == 1) System.out.println("odd");
        else System.out.println("even");
    }
}
