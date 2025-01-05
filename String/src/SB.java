public class SB {

    public static void main(String[] args) {

        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');

            series = series + ch;
        }

        System.out.println(series);

        //Here at every point new object is created every point
        //the memory is wasted a lot

        //hence we have to use the string which is mutable(can modify the value) so we use String Builder

        StringBuilder str = new StringBuilder("Deepak");
        System.out.println(str);

        StringBuilder builder = new StringBuilder();

        //Now previous example
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            builder.append(ch);
        }
        System.out.println(builder);

        //Some StringBuilder Methods

        System.out.println(builder.deleteCharAt(1));

        System.out.println(builder.indexOf("d"));

        System.out.println(builder.reverse());
    }
}
