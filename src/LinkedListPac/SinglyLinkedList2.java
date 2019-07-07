package LinkedListPac;

public class SinglyLinkedList2 {

    SinglyLinkedNode head;

    public void insertAtHead(int data){

        SinglyLinkedNode newNode = new SinglyLinkedNode(data);

        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public int length(){
        if(this.head == null){
            return 0;
        }

        int length = 0;
        SinglyLinkedNode current = this.head;
        while (current != null){
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        SinglyLinkedNode node = this.head;

        while (node != null){
            sb.append("node data ");
            sb.append(node.getData());
            sb.append("\n");

            node = node.getNextNode();
        }

        return sb.toString();
    }
}
