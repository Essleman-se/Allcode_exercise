package ReversSinglyLinnkedList;

import LinkedListPac.myOwnLinkedListExercise.SinglinkedList;

public class TestSinglyLinkedList {

    public static void main(String[] args){

        SinglinkedList integers = new SinglinkedList();

        integers.insertAtHead(10);
        integers.insertAtHead(20);
        integers.insertAtHead(30);
        integers.insertAtHead(40);

        System.out.println(integers);
    }
}
