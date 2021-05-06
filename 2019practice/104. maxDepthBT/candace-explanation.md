#  WRITE UP
[104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)<br/>

## Problem: 
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.

## Initial Insights
1. recursionnnnnn, add to the greater value, w base case as null 


## Solution:
1. recursion! for each node, return 1 + goleft/goright depending on which one is bigger

Time: O(n) for all nodes

Space: O(n) if you consider the stack frames.

## Learned:
1. i can indeed remember stuff from 2 years ago