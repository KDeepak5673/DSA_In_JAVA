import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = { 2 , 4 , 313 ,34 , 45, 2, 230 , 2};

        System.out.println(isExist(arr , 4 , 0));

        System.out.println(target(arr, 2 , 0));

        System.out.println(targetLast(arr, 2, arr.length-1));

        AllIndex(arr, 2 ,0);

        System.out.println(allIndex);

        System.out.println(AllIndexAsArray(arr , 4 , 0,  new ArrayList<>() ));


    }

    static boolean isExist(int[] arr ,int tar , int index){

        if(index == arr.length){
            return false;
        }

        return arr[index] == tar || isExist(arr, tar, index+1);
    }

    static int target(int[] arr ,int tar , int index){

        if(index == arr.length){
            return -1;
        }
        if(arr[index] == tar){
            return index;
        }

        return target(arr, tar, index+1);
    }
    static int targetLast(int[] arr ,int tar , int index){

        if(index == -1){
            return -1;
        }
        if(arr[index] == tar){
            return index;
        }
        else {
            return targetLast(arr, tar, index-1);
        }


    }

    static ArrayList<Integer> allIndex = new ArrayList<>();

    static void AllIndex(int[] arr ,int tar , int index){

        if(index == arr.length){
            return;
        }
        if(arr[index] == tar){
            allIndex.add(index);
        }

        AllIndex(arr, tar, index+1);
    }

    static ArrayList<Integer> AllIndexAsArray(int[] arr ,int tar , int index , ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }
        if(arr[index] == tar){
            list.add(index);
        }

        return AllIndexAsArray(arr, tar, index+1 , list) ;
    }


}
