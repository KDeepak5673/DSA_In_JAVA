public class DynamicStack extends CoustomStack {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            //double the arry size
            int[] temp = new int[data.length*2];

            //copy all previous data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];

            }
            data = temp;


        }
        return super.push(item);
    }
}
