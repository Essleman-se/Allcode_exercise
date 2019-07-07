package LinkedListPac;

public class SinglyLinkedList {
    Node head;

    static class Node{

        int data;
        Node nextNode;

        public Node(int data){ this.data = data;}
    }

    public void dysplay(){
        Node n = head;

        while(n != null) {
            System.out.println(n.data + "\n");
            n = n.nextNode;
        }
    }

    public static void main(String[] args){
        SinglyLinkedList list =  new SinglyLinkedList();

        list.head = new Node(20);
        Node second = new Node(90);
        Node third = new Node(87);
        Node fourth = new Node(45);

        list.head.nextNode = second;
        second.nextNode = third;
        third.nextNode = fourth;

        list.dysplay();
    }
}
