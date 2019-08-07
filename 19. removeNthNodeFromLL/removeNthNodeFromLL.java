import java.util.HashMap;

public class removeNthNodeFromLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        if (n == 0) return head;
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode curr = head; int num = 1;
        while (curr != null) {
            map.put(num++, curr);
            curr = curr.next;
        }
        num--;
        int before = num-n; int after = before + 2;
        if (before <= 0) {
            before = 0;
            after = 2;
            return map.containsKey(after) ? map.get(after) : null;
        } else {
            map.get(before).next = map.containsKey(after) ? map.get(after) : null;
            return map.get(1);
        }

        //map.get(before).next = map.containsKey(after) ? map.get(after) : null;
        //return before==0?map.get(2):map.get(1);
    }
}
