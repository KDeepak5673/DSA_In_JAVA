public class NewtonRapsonSQRT {

    public static void main(String[] args) {

        double num = 40;

        double ans = sqrt(num);

        System.out.println(ans);

    }
    static double sqrt(double X){

        double x = X;

        double root;

        while(true){
            root = 0.5*(x + (X/x));
            if(Math.abs(root - x) < 0.1){
                break;
            }
            x = root;

        }

        return root;
    }
}
