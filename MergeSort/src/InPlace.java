import java.util.Arrays;

public class InPlace {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = {5, 2, 7, 1, 6 ,3};

        mergeSort(arr , 0 , arr.length );

        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr , int s , int e){
        if(e - s == 1){
            return;
        }

        int mid = (s+e)/2;

        mergeSort(arr , s ,mid);
        mergeSort(arr , mid ,e);

        merge(arr , s, mid , e);
    }

    private static void merge( int[] arr , int s , int m , int e) {

        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e){

            if(arr[i] > arr[j]){
                mix[k] = arr[j];
                j++;
            }else {
                mix[k] = arr[i];
                i++;
            }
            k++;

        }

        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}