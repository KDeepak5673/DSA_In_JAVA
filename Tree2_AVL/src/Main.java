public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();

        for (int i = 0; i < 1000 ; i++) {
            tree.insert(i);

        }

//        tree.display();

        int h = tree.height();
        System.out.println(h);
    }

}