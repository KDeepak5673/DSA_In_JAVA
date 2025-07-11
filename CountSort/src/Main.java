import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void countSort(int[] arr){

        if(arr == null || arr.length <= 1){
            return;
        }

        int maxl = arr[0];
        for(int num : arr){

            if(num > maxl){
                maxl = num;
            }
        }
        int[] countArray = new int[maxl+1];

        for (int num : arr){
            countArray[num]++;
        }
        int index = 0;

        for (int i = 0 ; i <= maxl ;i++){
            while(countArray[i] > 0){
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }


    }

    public static void countSortHash(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer , Integer> countMap = new HashMap<>();

        for(int num : arr){
            countMap.put(num , countMap.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        for (int i = min ; i <= max ;i++){
            int count = countMap.getOrDefault(i , 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }



    }
    public static void main(String[] args) {
        int[] arr = {6,3,5,5,5,6,1,7,8};

//        countSort(arr);
        countSortHash(arr);

        System.out.println(Arrays.toString(arr));
    }
}