import java.util.*;
public class linkedListCycle {
    public int hasCycle(ListNode head) {
        return -1;
    }

    public int hasCycleHash(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode curr = head;
        int i = 0;
        while (curr != null){
            if (map.containsKey(curr.val)) return map.get(curr.val);
            map.put(curr.val, i);
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public int hasCycleON(ListNode head) {
        ListNode curr = head;
        int i = 0;
        while (curr != null) {
            ListNode nested = curr.next;
            while (nested != null) {
                if (nested == curr) return i;
                nested = nested.next;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public boolean hasCycleClever(ListNode head) {
        ListNode walker = head;
        if (walker == null) return false;
        ListNode runner = head;
        //check that runner can be set
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;//walker is guaranteed to be able to be set
            runner = runner.next.next;
            if (walker == runner) return true;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
