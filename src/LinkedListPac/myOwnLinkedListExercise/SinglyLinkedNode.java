package LinkedListPac.myOwnLinkedListExercise;

public class SinglyLinkedNode {

    int data;
    SinglyLinkedNode nextNode;

    public SinglyLinkedNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SinglyLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(SinglyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }
}
