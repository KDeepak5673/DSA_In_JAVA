import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        String name = "Deepak";

        System.out.println(name.charAt(0));
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(name.endsWith("k"));

        System.out.println(name.substring(1 ,3));

    }
}
