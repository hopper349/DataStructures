package LinkedList;

public class LinkedList {

    Node head;
    Node tail;
    int length = 0;

    public void append(int value) {
        Node node = new Node(value);

        if (tail != null) {
            tail.next = node;
            tail = node;
        } else {
            tail = node;
            head = tail;
        }
        length++;
    }

    public void prepend(int value) {
        Node n = new Node(value);

        if (head != null) {
            n.next = head;
        }
        head = n;
        length++;
    }

    public void insert(int index, int value) {
        if (index < length) {
            Node newNode = new Node(value);
            Node traverse = head;
            int i = 0;
            while (i < index - 1) {
                traverse = traverse.next;
                i++;
            }
            Node nextNode = traverse.next;
            traverse.next = newNode;
            newNode.next = nextNode;
            length++;
        } else {
            System.out.println("Out of Bonds");
        }
    }

    public void delete(int index) {
        if (index < length) {
            Node traverse = head;
            int i = 0;
            while (i < index - 1) {
                traverse = traverse.next;
                i++;
            }
            Node next = traverse.next;
            traverse.next = next.next;
            length--;
        } else {
            System.out.println("Out of Bonds");
        }
    }

    public void show() {
        Node sh = head;
        while (sh.next != null) {
            System.out.print(sh.data+", ");
            sh = sh.next;
        }
        System.out.print(sh.data);
        System.out.println();
    }

    public void reverse() {
        Node current = head;
        Node prev = null;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head=prev;
        tail=head;
    }

    public Node reverseKth(Node head,int index) {

        if(head==null){
            return null;
        }
        Node current = head;
        Node prev = null;
        Node next = null;

        int counter=0;
        while(current!=null && counter<index){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            counter++;
        }

        if(next!=null){
            head.next = reverseKth(next,index);
        }
        return prev;
    }
}
