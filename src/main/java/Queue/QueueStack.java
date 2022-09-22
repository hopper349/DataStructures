package Queue;

import Stack.StackArray;

public class QueueStack {

    StackArray stackArray = new StackArray();
    int length = 0;

    public void enqueue(int value) {
        stackArray.push(value);
        length++;
    }

    public void peek() {
        if (stackArray.arr.size() > 0) {
            System.out.println(stackArray.arr.get(0));
        }
    }

    public void dequeue() {
        if (stackArray.arr.size() > 0) {
            stackArray.arr.remove(0);
            length--;
        }
    }
}
