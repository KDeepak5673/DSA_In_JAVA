import java.util.Scanner;

public class MainBinaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binaryTree tree = new binaryTree();
        tree.populate(scanner);
//        tree.display();
        tree.preetyDisplay();
        tree.preOrder();
        tree.inOrder();
        tree.postOrder();
    }
}
