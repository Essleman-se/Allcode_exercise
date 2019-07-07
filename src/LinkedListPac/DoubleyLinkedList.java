package LinkedListPac;

public class DoubleyLinkedList {

    private DoublyLinkedNode head;


    public void insertAtHead(int data){

        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);
        if(this.head != null){
            this.head.setPreviousNode(newNode);
        }

        this.head = newNode;

    }

    public int length(){
        if (this.head == null)
            return 0;

        int length = 0;
        DoublyLinkedNode current = this.head;

        while(current != null){
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    @Override
    public String toString() {
        StringBuilder sb =  new StringBuilder();
        DoublyLinkedNode node = this.head;

        while (node != null) {
            sb.append("node Data  ");
            sb.append(node.getData());
            sb.append("\n");

            node = node.getNextNode();
        }

        return sb.toString();
    }


}
