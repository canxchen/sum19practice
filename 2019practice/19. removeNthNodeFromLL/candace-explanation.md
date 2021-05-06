#  WRITE UP
[19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)<br/>

## Problem: 
Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?

## Initial Insights
1. hashmap-> map indices, keep track of size, size - n is before and size - n + 2 is after
2. i didnt think of edge cases [stantwit face]

## Solution:
1. init hashmap[index,ListNode], size = 1
2. as you add nums to the map, increment size
3. get the before and after indices
    1. if ur reomving hte first index/ somehting before hte index, check that before is set correctly.
    2. if ur reomving hte last element, make sure you check that after is a vlid index
4. remove the head: normally this is the map(1) item, but its not in removing the first: gotta return the second element

Time: O(N)

Space: O(N)


## Learned:
1. EDGE CASES
2. constant space solution: find the element, and then shift stuff up