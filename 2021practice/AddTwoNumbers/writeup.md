#  WRITE UP

## Problem: 
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

1. The number of nodes in each linked list is in the range [1, 100].
2. 0 <= Node.val <= 9
3. It is guaranteed that the list represents a number that does not have leading zeros.

## Example:

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

## Quick Insights:
1. The different cases are summed up by the example: same length, both/one are 0, different length. First thought was two have two different loops: first go thru the length of the lists that are the same, and then handle the rest in the next loop. BUt had a feeling that handling all of it in one loop would b more impressive so did that: only add the value and advance the pointer of the list1/list2 node if it is not null.
2. One problem i ran into: i tried to make the node reference of the head and the one that goes thru the list creating new nodes the same one?? so that's one thing i need to remember for next time: when handling linked lists, have head/iterator nodes different.
3. Other bugs i ran into: was to calculate the carry, i was doing (currSum - carry)/10: didn't need the " - carry" part, that's gives an incomplete sum, not sure what i was doing there. also did not take care of the case where the iterator pointers of l1 and l2 are both null but the carry still has a value (so the end result has one more node than the longest list)

time: O(N) where N is size of longest list
space: O(N) where N is size of longest list technically could save space by modifying the paramter list

things to improve in next problem: think thru the step u r currently doing- what would a real input look like? what are the different inputs look like? also run thru the example input they give u. this would've prevented the incorrect carry bug, the leftover carry bug at end, and head node bug lol 

## Solution:

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int currSum = 0;
        ListNode one = l1;
        ListNode two = l2;
        ListNode prev = new ListNode();
        ListNode head = prev;
        while (one != null || two != null) {
            currSum = carry;
            if (one != null) {
                currSum += one.val;
                one = one.next;
            }
            if (two != null) {
                currSum += two.val;
                two = two.next;
            }
            prev.next = new ListNode(currSum%10);
            prev = prev.next;
            carry = currSum/10;
        }
        if (carry != 0) {
            prev.next = new ListNode(carry);
        }
        return head.next;
    }
}
