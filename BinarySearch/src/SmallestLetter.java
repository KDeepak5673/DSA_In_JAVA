public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c' , 'f' , 'j'};

        char target = 'j';

        char ans = Solution(arr , target);

        System.out.println(ans);
    }

    static char Solution(char[] letters , char tar){
        if(tar > letters[letters.length -1]){
            return letters[0];
        }

        int start = 0 ;
        int end = letters.length - 1 ;

        while(start <= end ){
            int mid = start + (end - start)/2 ;

            if(letters[mid] > tar){
                end = mid - 1;

            }else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];

    }

}
