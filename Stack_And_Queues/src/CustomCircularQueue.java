public class CustomCircularQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    public int size = 0;

    public CustomCircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomCircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {

        return size == data.length;
    }
    private boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item ){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;

        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is full!!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }
    public void display(){

        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        }while (i != end);
        System.out.println("END");
    }

}
