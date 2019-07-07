package LinkedListPac;

public class DoublyLinkedListDemo {

    public static void main(String[] args){

        DoubleyLinkedList integers = new DoubleyLinkedList();

        integers.insertAtHead(10);
        integers.insertAtHead(30);
        integers.insertAtHead(1);
        integers.insertAtHead(9);
        integers.insertAtHead(5);
        integers.insertAtHead(7);

        System.out.println(integers);
    }
}
