public class DoublyLL {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(56);
        list.insertFirst(57);
        list.insertFirst(58);
        list.insertFirst(59);
        list.insertFirst(55);
        list.insertLast(5);
        list.insert(59 ,2);
        list.display();

//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.delete(2));
//        list.display();
    }
}
