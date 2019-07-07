package ReversSinglyLinnkedList;

public class SinglyLinkedNode {

    int data;
    SinglyLinkedNode nextnode;

    SinglyLinkedNode(int data){

        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SinglyLinkedNode getNextnode()
    {
        return nextnode;
    }

    public void setNextnode(SinglyLinkedNode nextnode) {

        this.nextnode = nextnode;
    }
}
