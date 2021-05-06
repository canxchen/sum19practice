#  WRITE UP
[100. Same Tree](https://leetcode.com/problems/same-tree/)<br/>

## Problem: 
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false

## Initial Insights
1. inorder traversal, using queue

## Solution:
1. inorder traversal using queue

Time: O(N): smaller tree

Space: O(M+N)


## Learned:
1. careful with null values when using linkedlist implementtion of queues.
2. stacks are depth first seraching bro
3. yah