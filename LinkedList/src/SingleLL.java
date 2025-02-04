public class SingleLL {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(56);
        list.insertFirst(57);
        list.insertFirst(58);
        list.insertFirst(59);
        list.insertFirst(55);
        list.insertLast(5);
        list.insertMiddle(6, 2);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();





    }
}
