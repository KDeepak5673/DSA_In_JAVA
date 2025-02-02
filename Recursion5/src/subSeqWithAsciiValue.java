import java.util.ArrayList;

public class subSeqWithAsciiValue {
    public static void main(String[] args) {
        

//        Ascii("" , "abc");
        System.out.println(subSeqRet("" , "abc"));
    }

    private static void Ascii(String p, String up) {

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        Ascii(p+ch , up.substring(1));
        Ascii(p , up.substring(1));
        Ascii(p + (ch +0), up.substring(1));

    }

    static ArrayList<String> subSeqRet(String p , String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subSeqRet(p+ch , up.substring(1));
        ArrayList<String> second =  subSeqRet(p , up.substring(1));
        ArrayList<String> third =  subSeqRet(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
