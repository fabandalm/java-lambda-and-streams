package com.falmeida.tech.data_structure;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                dummy.next = l1;
                l1 = l1.next;
            }else{
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        if(l1 != null){
            dummy.next = l1;
        }else{
            dummy.next = l2;
        }

        return head.next;
    }


}
