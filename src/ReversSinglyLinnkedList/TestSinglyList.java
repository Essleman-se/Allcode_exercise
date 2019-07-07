package ReversSinglyLinnkedList;

public class TestSinglyList {

    public static void main(String[] args){
        SinglyList integers = new SinglyList();

        integers.head = new SinglyList.Node(10);
        SinglyList.Node second = new SinglyList.Node(20);
        SinglyList.Node third = new SinglyList.Node(30);
        SinglyList.Node four = new SinglyList.Node(40);

        integers.head.nextNode = second;
        second.nextNode = third;
        third.nextNode = four;

        System.out.println(integers);

    }

}
