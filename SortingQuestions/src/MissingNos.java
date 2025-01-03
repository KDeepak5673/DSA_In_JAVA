//https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class MissingNos {
    public static void main(String[] args) {
        int[] arr = {3,0,2,1};

        int ans = Solution(arr);

        System.out.println(ans);

    }

    static  int Solution(int[] arr){

        int i = 0;

        while(i < arr.length){

            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr , i , correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first , int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}