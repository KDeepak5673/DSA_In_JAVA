import java.util.ArrayList;

public class ReturnListWithoutArgument {
    public static void main(String[] args) {

        int[] arr = {1,2 ,3,5, 3, 1,2 ,3,4,5,6,40};

        System.out.println(allIndex(arr , 1,0));

    }

    static ArrayList<Integer> allIndex(int[] arr , int tar , int index ){

        ArrayList<Integer> list = new ArrayList<>();

        if( index == arr.length){

            return list;
        }

        if(arr[index] == tar){

            list.add(index);

        }

        ArrayList<Integer> ansFromBelowCalls = allIndex(arr ,tar , index+1);

        list.addAll(ansFromBelowCalls);

        return list;

    }
}
