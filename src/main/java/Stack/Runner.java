package Stack;

public class Runner {

    public static void main(String[] args) {
        StackArray stack = new StackArray();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.pop();
        stack.pop();

        stack.peek();
    }
}
