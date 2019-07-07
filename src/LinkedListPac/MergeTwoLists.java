package LinkedListPac;

import java.util.Arrays;

public class MergeTwoLists {

    public static  void main(String[] args){
        ListNode l1 = new ListNode(90);
        ListNode second = new ListNode(56);
        ListNode third = new ListNode(9);
        ListNode fourth = new ListNode(30);

        l1.next = second;
        second.next = third;
        third.next = fourth;

        ListNode l2 = new ListNode(12);
        ListNode second2 = new ListNode(7);
        ListNode third2 = new ListNode(94);
        ListNode fourth2 = new ListNode(200);

        l2.next = second2;
        second2.next = third2;
        third2.next = fourth2;

        System.out.println(Arrays.asList(mergeTwoLists(l1, l2)));

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p=head;

        ListNode p1=l1;
        ListNode p2=l2;
        while(p1!=null && p2!=null){
            if(p1.val < p2.val){
                p.next = p1;
                p1 = p1.next;
            }else{
                p.next = p2;
                p2 = p2.next;
            }
            p=p.next;
        }

        if(p1!=null){
            p.next = p1;
        }

        if(p2!=null){
            p.next = p2;
        }

        return head.next;
    }
}

 class ListNode{
    int val;
    ListNode next;

    ListNode(int data){
        this.val = data;
    }
}
