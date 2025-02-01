import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        phone("" , "12");
        System.out.println(phoneRet("" , "23"));
    }

    static void phone(String p ,String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            phone(p+ch , up.substring(1));
            
        }
    }
    static ArrayList<String> phoneRet(String p , String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3; i++) {

            char ch = (char)('a' + i);

            ans.addAll(phoneRet(p + ch , up.substring(1)));

        }

        return ans;
    }

}