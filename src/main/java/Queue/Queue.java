package Queue;

import LinkedList.Node;

public class Queue {

    Node first;
    Node last;
    int length=0;

    public void enqueue(int value){
        Node n =  new Node(value);
        if(last == null){
            first = n;
        }
        else {
            last.next = n;
        }
        last = n;
        length++;
    }

    public void dequeue(){
        if(length==0){
            System.out.println("No elements to Dequeue");
        }
        else{
            first = first.next;
            length--;
        }
    }

    public void peek(){
        if(length>0) {
            System.out.println(first.data);
        }
        else {
            System.out.println("No elements to Show");
        }
    }
}
