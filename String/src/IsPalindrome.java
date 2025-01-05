public class IsPalindrome {
    public static void main(String[] args) {

        String str = "abavaba";

        StringBuilder strbui = new StringBuilder();

        strbui.append(str);

        strbui.reverse();

        System.out.println(strbui);
        System.out.println(str);

        if(str.equals(strbui.toString())){
            System.out.println("yes");
        }else{
            System.out.println("False");
        }
    }
}
