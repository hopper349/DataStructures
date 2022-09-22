package Stack;
import java.util.ArrayList;

public class StackArray {

    public int length = 0;
    public ArrayList<Integer> arr = new ArrayList<>();


    public void push(int value) {
        arr.add(value);
        length++;
    }

    public void pop() {
        arr.remove(length - 1);
        length--;
    }

    public void peek() {
        if (length > 0) {
            System.out.println(arr.get(length-1));
        }
        else{
            System.out.println("No elements to show");
        }
    }
}
