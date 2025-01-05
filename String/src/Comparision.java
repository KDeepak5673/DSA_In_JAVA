public class Comparision {


    public static void main(String[] args) {


        // Declaring Strings
        String s1 = "TAT";
        String s2 = "TAT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");

        //Comparision


        String a = new String("string");
        String b = new String("string");

        //used only when no new object is created

        System.out.println("For using a comaparator :  " + (a == b));

        //for checking value we use .equals method in diffferent object

        System.out.println("For using a .equals method : " + a.equals(b));


    }
}
