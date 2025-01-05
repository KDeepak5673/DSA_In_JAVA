import java.util.Arrays;

public class PrintStream {

    public static void main(String[] args) {

        //At last all is print as String irrespective of Integer or Object

        //Integer.toString(i);
        System.out.println(56);

        //return (obj == null) ? "null" : obj.toString();
        System.out.println("Deepak");

        //return (obj == null) ? "null" : obj.toString();
        System.out.println(new int[]{1,2,3,});

        // here we have to overridden the toString function with array
        System.out.println(Arrays.toString(new int[]{1,2,3,}));

        //Another example of toString method
        Integer num = new Integer(56);
        System.out.println(num.toString());










    }
}
