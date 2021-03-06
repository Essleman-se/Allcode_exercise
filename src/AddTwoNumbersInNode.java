import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbersInNode {

    public static void main(String[] args){
        List listOne = new LinkedList();
        List listTwo = new LinkedList();

        listOne.add(2);
        listOne.add(4);
        listOne.add(3);

        listTwo.add(5);
        listTwo.add(6);
        listTwo.add(4);


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummyHead;
        int carry = 0;
       while(p != null || q != null) {
           int x = (p != null) ? p.val : 0;
           int y = (q != null) ? q.val : 0;
           int sum = carry + x + y;
           carry = sum / 10;
           curr.next = new ListNode(sum % 10);
           curr = curr.next;

           if (p != null) p = p.next;
           if (q != null) q = q.next;
       }

       if(carry > 0){

           curr.next = new ListNode(carry);
       }

        return dummyHead.next;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}