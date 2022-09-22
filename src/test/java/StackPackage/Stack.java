package StackPackage;


public class Stack<T> {

    Node top;
    Node bottom;
    int length=0;

    public void push(T data){
        Node newNode =  new Node(data);

        if(top==null){
            top = newNode;
            bottom= newNode;
        }
        else{
            top.next = newNode;
            top = newNode;
        }
        length++;
    }

    public void pop(){
        if(top==null){
            System.out.println("No elements to remove");
        }
        else{
            Node traverse = bottom;
            while (traverse.next == top){
                traverse = traverse.next;
            }
            top = traverse;
            top.next = null;
            length--;
        }
    }

    public void peek(){
        System.out.println(top.data);
    }

    @Override
    public String toString(){
        String str = "[";

        Node node = bottom;

        while(node.next!=null){
            str += node.data + ", ";
            node =  node.next;
        }
        str+=node.data+"]";
        return str;
    }
}
