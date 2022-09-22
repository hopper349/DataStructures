package Stack;

import LinkedList.Node;

public class Stack {

    Node top = null;
    Node bottom = null;
    int length = 0;

    public void push(int value) {
        Node n = new Node(value);
        if (top == null) {
            top = n;
            bottom = n;
        } else {
            top.next = n;
            top = n;
        }
        length++;
    }

    public void peek() {
        System.out.println(top.data);
    }

    public void pop(){
        if(top!=null){
            top = top.next;
            length--;
        }
        else{
            System.out.println("No elements to pop");
        }
    }
}
