package LinkedListPac.myOwnLinkedListExercise;

public class SinglyLinkedList {

    Node head;

    static class Node{
        int data;
        Node nextNode;

        public Node(int data){
            this.data = data;
        }

    }

    public void dispaly(){
        Node node = head;
        while(node != null){
            System.out.println("Node Data");
            System.out.println(node.data);
            System.out.println("\n");

            node = node.nextNode;
        }
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();
        Node node = head;

        while (node != null){
            sb.append("Node Data  ");
            sb.append(node.data);
            sb.append("\n");

            node = node.nextNode;
        }

        return sb.toString();
    }

    public static void main(String[] args){
        SinglyLinkedList integers = new SinglyLinkedList();

        integers.head = new Node(90);
        Node second = new Node(100);
        Node third = new Node(65);
        Node fourth = new Node(40);

        integers.head.nextNode = second;
        second.nextNode = third;
        third.nextNode = fourth;


        //integers.dispaly();

        System.out.println(integers);
    }

}
