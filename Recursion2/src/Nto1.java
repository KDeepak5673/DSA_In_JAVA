public class Nto1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        fun(7);
//        fun2(7);
        fun3(7 );
    }

    static void fun(int n ){

        if(n == 0){
            return;
        }
        System.out.println(n);

        fun(n-1);

    }

    static void fun2(int n ){

        if(n == 0){
            return;
        }
        fun2(n-1);
        System.out.println(n);



    }
    static void fun3(int n ){

        if(n == 0){
            return;
        }

        System.out.println(n);

        fun3(--n);



    }
}