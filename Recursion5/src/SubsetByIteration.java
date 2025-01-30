import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetByIteration {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2 };

        System.out.println(subsetDub(arr));
        System.out.println(subset(arr));
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int x : arr) {

            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));

                inner.add(x);

                outer.add(inner);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetDub(int[] arr){

        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int s = 0;
        int e = 0;

        for (int x = 0 ; x < arr.length ; x++) {

            s = 0;

            if(x > 0 && arr[x] == arr[x-1]){
                s = e + 1;
            }
            e = outer.size()-1;
            int n = outer.size();
            for (int i = s; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[x]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
