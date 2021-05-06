import java.util.*;
public class mergeKSortedLists {
    public static void main(String args[]) {
        //5,10,9
        ListNode first = new ListNode(5);
        ListNode adding = first;
        adding.next = new ListNode(10);
        adding = adding.next;
        adding.next = new ListNode(9);

        //2,8,1,3
        ListNode second = new ListNode(2);
        adding = second;
        adding.next = new ListNode(8);
        adding=adding.next;
        adding.next = new ListNode(1);
        adding=adding.next;
        adding.next = new ListNode(3);

        //7,4,6
        ListNode third = new ListNode(7);
        adding = third;
        adding.next = new ListNode(4);
        adding=adding.next;
        adding.next = new ListNode(6);

        ListNode[] input = new ListNode[3];
        input[0]=first;input[1]=second; input[2]=third;

        ListNode ans = new ListNode(1);
        adding = ans;
        for (int i = 2; i <= 10; i++) {
            adding.next = new ListNode(i);
            adding = adding.next;
        }

        ListNode returned = mergeKLists(input);
        adding=returned;
        while (adding!=null){
            System.out.println(adding.val);
            adding = adding.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> heap = new PriorityQueue<>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode one, ListNode two) {
                if (one == null && two == null)
                    return 0;
                else if (one == null && two != null)
                    return -1;
                else if (one != null && two == null)
                    return 1;
                if (one.val > two.val)
                    return 1;
                else if (two.val > one.val)
                    return -1;
                else
                    return 0;
            }
        } );
        ListNode answer;ListNode curr; ListNode prev;
        for (int i = 0; i < lists.length; i++) {
            curr = lists[i];
            while (curr != null) {
                heap.add(curr);
                curr = curr.next;
            }
        }
        //reset the head of listNode to first element
        prev = answer = heap.poll(); //poll takes care of empty heap case
        while (!heap.isEmpty()) {
            //take out min value
            curr = heap.poll();

            //set previous' next value to curr
            prev.next = curr;

            prev = curr;
        }
        prev.next = null;
        return answer;
    }
}

 class ListNode {
    int val;
     ListNode next;
   ListNode(int x) { val = x; }
 }

