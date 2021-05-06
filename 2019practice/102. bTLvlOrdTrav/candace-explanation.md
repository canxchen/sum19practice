#  WRITE UP
[102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)<br/>

## Problem: 
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

## Initial Insights
1. arraylists, get height, add arraylists in the the master arraylist, populate recursively with height and arrlist in parameters

## Solution:
1. improved version: dont finfd height first! just go thru, and check if the height that ur at exists in the arr list. if not, create it
2. then add it, and go left and right

Time: O(N)

Space: O(N)


## Learned:
1. smol tips and tricks to avoid going thru the whole thing just toget a number def do ecist