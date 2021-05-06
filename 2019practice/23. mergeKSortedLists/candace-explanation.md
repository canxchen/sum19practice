#  WRITE UP
https://leetcode.com/problems/merge-k-sorted-lists/

## Problem: 
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:<br />
[
  1->4->5, <br />
  1->3->4, <br />
  2->6 <br />
]<br />
Output: 1->1->2->3->4->4->5->6

## Initial Insights
1. I did smth like this for practice earlier this yr, and i used separately instantiated variables to keep track of one element per list, and iterate through all of them slowly. not possible here (?), thought about nested for loops: for all lists, go through all elements the same way, but that can't work (still need ousitde variables)
2. peeked in on the category: heaps, so a solution could be to just insert all elements in a min heap and create a new list like that.

## Solution:
1. put all nodes in the input list into the heap
2. extract from the heap, putting into final linked list
3. VOILa

Time: O(NlogN): N is all elements in parameter: for all nodes, insert it into a heap

Space: O(N) : all elements: hold all of the elements in a heap and a linked list


## Learned:
1. you can pass ocmparators into priority queue constructors: PriorityQueue<type> thing = new PriorityQueue<>(new Comparator() { @override public int compare(one, two){} })
2. if: have to create a Linked List and return the head, but u dont want an extra line to add the head before the loop: just add a dummy node in front, and return the next node (which is the real head)!