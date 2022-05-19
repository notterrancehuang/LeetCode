package easy;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode result = new ListNode();
        ListNode tail = result;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                tail.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            tail = tail.next;
        }

        while (list1 != null) {
            tail.next = new ListNode(list1.val);
            list1 = list1.next;
            tail = tail.next;
        } 
        while (list2 != null) {
            tail.next = new ListNode(list2.val);
            list2 = list2.next;
            tail = tail.next;
        }

        return result.next;
    }
}