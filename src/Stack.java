public class Stack {
    private int top = -1;
    private int[] storage;

    public Stack(int size) {
        storage = new int[size];
    }

    public void push(int data){
        if(isFull()){
            System.out.println("фулловий стек");
        } else {
            storage[++top] = data;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("empty staack");
            return -1;
        } else {
            return storage[top--];
        }
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        } else {
            return storage[top];
        }
    }
    public int size(){
        return top +1;
    }
    public boolean isFull(){
        return top == storage.length - 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
}

