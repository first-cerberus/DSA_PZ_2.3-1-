public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        //stack.push(5);
        System.out.println("who is on the top of the stack? " + stack.peek());
        System.out.println("capacity is " + stack.size());
        System.out.println("isFull? " + stack.isFull());
        System.out.println("retrieved element? " + stack.pop());
        System.out.println("empty? " + stack.isEmpty());


    }
}