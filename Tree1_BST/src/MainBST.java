public class MainBST {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] nums = { 5,2,6,7,5,9,10,1,2};
        tree.populate(nums);

        tree.display();
    }
}
