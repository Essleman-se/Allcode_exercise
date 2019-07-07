package ReversSinglyLinnkedList;

import LinkedListPac.SinglyLinkedNode;

public class SinglyLinkedList {

    SinglyLinkedNode head;

    public void insertAtHead(int data){

//        SinglyLinkedNode newNode = new SinglyLinkedNode(data);
//        newNode.setNextNode(this.head);
//        this.head = newNode;

        SinglyLinkedNode newNode = new SinglyLinkedNode(data);

        newNode.setNextNode(this.head);
        this.head = newNode;

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        //SinglyLinkedNode node = head;

        while (head != null){
            sb.append("Node Data  ");
            sb.append(head.getData());
            sb.append("\n");

            head = head.getNextNode();
        }


        return sb.toString();
    }
}
