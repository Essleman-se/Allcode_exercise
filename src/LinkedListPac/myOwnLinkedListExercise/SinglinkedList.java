package LinkedListPac.myOwnLinkedListExercise;

public class SinglinkedList {

    SinglyLinkedNode head;

    public void insertAtHead(int data){
        SinglyLinkedNode node = new SinglyLinkedNode(data);

         node.setNextNode(head);
         head = node;


    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        SinglyLinkedNode node = head;

        while (node != null){
            sb.append("Node Data  ");
            sb.append(node.data);
            sb.append("\n");

            node = node.getNextNode();
        }

        return sb.toString();
    }
}
