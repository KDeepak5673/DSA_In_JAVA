public class PreetyPrinting {
    public static void main(String[] args) {

        float a = 456.6546f;

        System.out.printf("Formatted num is %.2f" , a);
        System.out.println(" ");

        System.out.printf( "Pie : %.2f", Math.PI);
        System.out.println(" ");

        System.out.printf("My name is %s and my age is %d" , "Deepak" , 21);

/*
        General Placeholders:
            %s : String
            %d : Decimal (integer)
            %f : Floating-point number
            %c : Character
            %b : Boolean (true or false)
            %n : New line (platform independent)
            %% : Literal '%' character
        Numeric Formatting:
            %x : Hexadecimal (lowercase)
            %X : Hexadecimal (uppercase)
            %o : Octal
            %,d : Comma-separated integer
            %+.2f : Floating-point with sign and 2 decimal places
            %08d : Integer padded with zeros to 8 digits
        Date and Time Formatting:
            %tY : Year (e.g., 2023)
            %tm : Month (e.g., 01 for January)
            %td : Day of the month (e.g., 12)
            %tH : Hour (0-23)
            %tM : Minute (0-59)
            %tS : Second (0-59)


 */
    }
}
