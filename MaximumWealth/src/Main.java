public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {3, 2, 1}
        };

        int[][] array2 = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        System.out.println("Answer : " + Maxwealth(array));

        System.out.println("Answer : " + Maxwealth(array2));

    }

    static int Maxwealth(int[][] account) {

        int[] count = new int[account.length];

        for (int i = 0; i < account.length; i++) {

            count[i] = 0;

            for (int j = 0; j < account[i].length; j++) {

                count[i] += account[i][j];
            }
        }


        int maximum = count[0];

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maximum) {
                maximum = count[i];
            }

        }

        return maximum;


    }

}