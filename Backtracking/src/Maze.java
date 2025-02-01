import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {

        int ans = count(3,3);
        System.out.println(ans);

        path("",3,3);

        System.out.println(pathRet("" , 3, 3));

        System.out.println(pathRetDia("" , 3,3));

    }
    static int count(int r , int c){

        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1 ,c);
        int right = count(r , c-1);

        return left+right;
    }

    static void path(String p , int r , int c){

        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p + 'R' , r-1 , c);
        }
        if(c > 1){
            path(p + 'D' , r , c-1);
        }
    }
    static ArrayList<String> pathRet(String p , int r ,int c){

        if(r == 1 && c == 1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(pathRet(p + 'R' , r-1 , c));
        }
        if(c>1){
            ans.addAll(pathRet(p + 'D' , r , c-1));
        }


        return ans;
    }

    static ArrayList<String> pathRetDia(String p , int r ,int c){

        if(r == 1 && c == 1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1 && c>1){
            ans.addAll(pathRetDia(p + 'D' , r-1 , c-1));
        }
        if(r>1){
            ans.addAll(pathRetDia(p + 'R' , r-1 , c));
        }

        if(c>1){
            ans.addAll(pathRetDia(p + 'D' , r , c-1));
        }


        return ans;
    }
}