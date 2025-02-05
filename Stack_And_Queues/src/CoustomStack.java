public class CoustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public boolean push(int item ){

        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;

    }
    public int pop() throws  StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }

        return data[ptr--];
    }

    private boolean isEmpty(){
        return ptr == -1;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an stack!!");

        }
        return data[ptr];
    }

    public boolean isFull() {

        return ptr == data.length-1;
    }

    public CoustomStack() {
        this(DEFAULT_SIZE);
    }

    public CoustomStack(int size) {
        this.data = new int[size];
    }
}
