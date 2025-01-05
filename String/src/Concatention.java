import java.util.ArrayList;

public class Concatention {
    public static void main(String[] args) {
        System.out.println("a" + "b");

        //when we use single quotes it will calculate its ASCII value and then operate according to this
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');


        char ch = 'a';
        System.out.println(ch + 3);
        System.out.println((char)(ch + 3));

        System.out.println("a" + 1);

        System.out.println("deepak" + new ArrayList<>());
        //If there is one String to it the concat converted into string
        //For Example
        System.out.println(new Integer(56) + " "+  new ArrayList<>());
    }
}
