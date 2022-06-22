package main.easy;

import utils.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                // there is a duplicate
                // increment next
                curr.next = curr.next.next;
            } else {
                // increment current node
                curr = curr.next;
            }
        }

        return head;
    }
}