import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        StringBuffer sb2 = new StringBuffer("Deepak Kumar");

        StringBuffer sb3 = new StringBuffer(30);

        sb.append("Deepak");

        sb3.append("My name is Deepak Kumar. I am in IIIrd Year from VIT BHOPAL UNIVERSITY");

        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb3);

        System.out.println(sb3.capacity());
        System.out.println(sb.capacity());

        Random rb = new Random();

        float f = rb.nextFloat();


        System.out.println(f);

        int n = 20;

        String name = randomString.generate(n);

        System.out.println(name);


        //remove White-Spaces

        String sentence = "Hii , I am Deepak kumar";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s" , ""));

        //split
        String arr = "Deepak kumar is smart boy";

        String[] split = arr.split(" ");
        System.out.println(Arrays.toString(split));

        //roundOff
        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.println(df.format(7.295687));

    }
}