package StackPackage;

public class Node<T> {
    public T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
