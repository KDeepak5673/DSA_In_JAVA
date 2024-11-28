public class Main {
    public static void main(String[] args) {

        int[] Input = {-10,5444,5645,45,889,99895};

        System.out.println("Answer : " + answer(Input));

    }

    static int answer(int[] nums){

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(even(nums[i])){
                count++;
            }
        }

        return count;
    }

    static boolean even(int num){

        int count = 0;

        if(num < 0 ){
            num = num * -1;
        }

        while(num>0){
            count++;
            num = num/10;
        }

        if(count % 2 == 0){
            return true;
        }

        return false;
    }
}