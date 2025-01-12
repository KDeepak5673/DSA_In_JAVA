public class numberExampleRecursion {
    public static void main(String[] args) {

        //write a function that takes in a number ans prints it
        // print first five numbers: 1 2 3 4 5

        print(1);
    }

    static void print(int n) {

        if(n == 5 ){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

}