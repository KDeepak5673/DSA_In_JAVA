import java.util.ArrayList;

public class FactorsOfNumber {
    public static void main(String[] args) {
//        factors(20);

        factors2(20);
    }

    static void factors(int num){

        for (int i = 1; i<= Math.sqrt(num); i++) {
            if(num % i == 0){
                if(num/i == i){
                    System.out.print(i + " ");
                }else {

                    System.out.print(i + " " +num/i +" ");

                }

            }
        }
    }

    //In sorted order (time and space complexity is o(sqrt(n))
    static void factors2(int num){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i<= Math.sqrt(num); i++) {
            if(num % i == 0){
                if(num/i == i){
                    System.out.print(i + " ");
                }else {

                    System.out.print(i + " " );
                    list.add(num/i);

                }

            }
        }

        for (int i = list.size() -1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }


}


