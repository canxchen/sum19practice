#  WRITE UP
[141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)<br/>

## Problem: 
Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

 

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.


Example 2:

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.


Example 3:

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

## Initial Insights
1. O(N) time+space solution: hashmap, value->index, while loop through, check if value exists in list if yes return position
2. O(N^2) time solution, O(1) space: 2 pointers: slow + fast, check for fast==slow, terminate each loop at fast==null
3. looked up solution for the other two pointer solution, the tortoise+rabbit/walker+runner solution

## Solution:
1. 2 pointers, one advances by 1 and one advances by 2: at some point, faster will surpass slower. but what if faster always just misses slower?

Time: O(N)

Space: O(1)


## Learned:
1. two pointers!!