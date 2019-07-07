package ReversSinglyLinnkedList;

public class SinglyList {
    Node head;

    static class Node{
        int data;
        Node nextNode;

        public Node(int data){
            this.data = data;
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

}
