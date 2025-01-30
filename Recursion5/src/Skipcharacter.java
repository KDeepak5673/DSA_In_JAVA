public class Skipcharacter {

    public static void main(String[] args) {
        String s = "baccad";

        skip("" , s);

        System.out.println(skip(s));


    }

    //the Empty and UnProcessed Data passed on argument
    //The changes made on a p data and up is getting emptied at every stage
    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p , up.substring(1));
        }
        else{
            skip(p +ch , up.substring(1));
        }
    }


    //Here the new string created at every step and on returning in recursion
    //the ch is been added
    static String skip(String up){
        if(up.isEmpty()){
            return " ";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }
    }
}
