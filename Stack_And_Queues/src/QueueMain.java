public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);

        queue.insert(54);
        queue.insert(52);
        queue.insert(51);
        queue.insert(50);
        queue.insert(49);

        queue.display();

        queue.remove();

        System.out.println(queue.front());

        queue.display();

        DynamicQueue cirque = new DynamicQueue(5);
        cirque.insert(54);
        cirque.insert(44);
        cirque.insert(34);
        cirque.insert(24);
        cirque.insert(14);

        cirque.display();

        System.out.println(cirque.remove());
        cirque.insert(4);

        System.out.println(cirque.front());

        cirque.insert(1);
        cirque.insert(6);

        cirque.display();

    }
}
