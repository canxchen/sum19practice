public class mergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        ListNode one = l1; ListNode two = l2;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = new ListNode(l1.val);
                l1=l1.next;
            } else {
                curr.next = new ListNode(l2.val);
                l2=l2.next;
            }
            curr= curr.next;
        }
        if (l1 == null) curr.next = l2;
        else if (l2 == null) curr.next = l1;
        return head.next;
    }
}
