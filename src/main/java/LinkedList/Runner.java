package LinkedList;

public class Runner {

    public LinkedList reverse(LinkedList list) {
        Node current = list.head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;

        return list;
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(10);
        linkedList.append(5);
        linkedList.append(11);
        linkedList.append(13);
        linkedList.append(14);
        linkedList.append(4);
//        linkedList.prepend(5);
        linkedList.append(17);
//        linkedList.prepend(51);
//        linkedList.insert(4,133);
        linkedList.show();
//        linkedList.reverse();
        System.out.println("**************************");
//        linkedList.show();
        System.out.println("**************************");

//        linkedList.delete(2);
//        linkedList.delete(1);
//        linkedList.show();
       linkedList.head =  new LinkedList().reverseKth(linkedList.head,3);

        linkedList.show();
    }
}
