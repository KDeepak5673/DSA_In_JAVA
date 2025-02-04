import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(45);
        arrList.add(56);
        arrList.add(76);
        arrList.add(66);

        arrList.add(4 , 44);

        System.out.println(arrList);
        list.add(65);
        list.add(68);
        list.add(69);
        list.add(2 , 66);

        System.out.println(list);



    }
}