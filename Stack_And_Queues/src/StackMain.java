import java.util.Arrays;

public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);

        stack.push(56);
        stack.push(55);
        stack.push(46);
        stack.push(68);
        stack.push(65);
        stack.push(66);
        stack.push(63);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
