#  WRITE UP
[297. Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/)<br/>

## Problem: 
Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.

Example: 

You may serialize the following tree:

    1
   / \
  2   3
     / \
    4   5

as "[1,2,3,null,null,4,5]"
Clarification: The above format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.

Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.

## Initial Insights
1. string buffer, insert stuff bfs thru queue

## Solution:
1. queue, add stuff in node in order that way to serialize
2. deserialize: split by "," queue items, give all dequeued items 2 children from the array of nodes

Time: O(N)

Space: O(N)


## Learned:
1. its fast and takes less time if you just use preorder traversal. ie process curr, process left, process right.
  1. serialize: preorder traversal.  N L R, so its not stored in the level by level way that the example has. is recursive.
  2. deserialize: add all nodes into Deque (queue where you add to front and back). remove the first item each recursive call, and process curr val before setting the left nad right of curr as the return values of calls on left and right
2. ingeneral, if u go thru a tree in a certain order printing hte values. and then try to rebuild that tree thru the string and going thru the same traversal, itll work. bc as you traverse as you rebuild, youll encounter the same nodes as in the stirng at the same time.