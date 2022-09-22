package Practise.LL;

public class LinkedList<T> {

    Node head;
    Node tail;
    int length = 0;

    public void append(T data) {
        Node newNode = new Node(data);

        if (tail == null) {
            tail = newNode;
            head = tail;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        length++;
    }

    public void prepend(T data) {
        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        length++;
    }

    public void insert(int index, T data) {
        Node newNode = new Node(data);
        int i = 0;

        Node traverseNode = head;

        while (i < index - 1) {
            traverseNode = traverseNode.next;
            i++;
        }
        Node temp = traverseNode.next;
        traverseNode.next = newNode;
        newNode.next = temp;
        length++;
    }

    public void delete(int index) {

        Node traverseNode = head;
        int i = 0;

        while (i < index - 1) {
            traverseNode = traverseNode.next;
            i++;
        }

        Node temp = traverseNode.next;
        Node next = temp.next;
        traverseNode.next = next;
        length--;
    }

    @Override
    public String toString() {
        Node node = head;
        String str = "[";
        while (node.next != null) {
            str = str + node.data + ", ";
            node = node.next;
        }

        str += node.data+ "]";
        return str;
    }

}
