import java.util.*;
public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //if (head == null) return null;
        ListNode curr = head;
        Stack<ListNode> stacko = new Stack<>();
        while (curr != null) {
            stacko.add(curr);
            curr = curr.next;
        }
        ListNode fakeHead = new ListNode(-1);
        curr = fakeHead;
        while(!stacko.isEmpty()) {
            curr.next = new ListNode(stacko.pop().val);
            curr = curr.next;
        }
        return fakeHead.next;
    }
}