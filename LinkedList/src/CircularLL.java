public class CircularLL {

    public static void main(String[] args) {
        CLL list = new CLL();

        list.insert(23);
        list.insert(25);
        list.insert(27);
        list.insert(29);

        list.delete(27);
        list.display();
    }

}
