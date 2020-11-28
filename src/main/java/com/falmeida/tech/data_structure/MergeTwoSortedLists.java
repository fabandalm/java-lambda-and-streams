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


    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){

        return null;
    }


}
