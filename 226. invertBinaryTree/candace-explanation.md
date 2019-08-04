#  WRITE UP
[226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)<br/>

## Problem: 
Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1



## Initial Insights
1. some sort of queue: store each level, and pop twice?
2. just go with what ya know u dingus (inorder traversal thats recursive)

## Solution:
1. resursion! give to_copy and new_copy, both of which are instantiated. new_copy.value = to_copy.value; new_copy.left = rec(to_copy.right, new TreeNode(-1)); new_copy.right = rec(to_copy.left, new TreeNode(-1)); return new_copy

Time: O(N) num nodes

Space: O(N) num nodes


## Learned:
1. go with what you know