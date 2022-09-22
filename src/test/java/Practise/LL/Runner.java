package Practise.LL;

public class Runner {

    public static void main(String[] args) {

        LinkedList<String> objectLinkedList = new LinkedList<>();

        objectLinkedList.append("Dipanshu");
        objectLinkedList.append("Sameer");
        objectLinkedList.append("Arvind");
        objectLinkedList.prepend("Pratham");
        objectLinkedList.delete(2);
        objectLinkedList.insert(2,"Sameer");
        System.out.println(objectLinkedList.head.data);
        System.out.println(objectLinkedList);
    }

}
