import java.util.*;

public class InbuildFunction {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(56);
        stack.push(55);
        stack.push(46);
        stack.push(6);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>();

        queue.add(45);
        queue.add(5);
        queue.add(145);

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(45);
        deque.add(89);
        deque.addFirst(56);

        System.out.println(deque);



    }
}