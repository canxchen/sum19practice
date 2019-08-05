#  WRITE UP
[572. Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/)<br/>

## Problem: 
Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4 
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.
Example 2:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.

## Initial Insights
1. check each subtree!

## Solution:
1. main method: go thru all nodes if secondary==true, ret true. else try left and right . secondary: chec kthe subtree of that node. if ==, try left and right. if no, return false

Time: O(n^2)

Space: O(n)


## Learned:
1. caught some trouble iwth the retrying! made a purely recursive method, that retried within itself. if curr!=target.val, try left and right.
2. so just use one recursie method for oging to each node, and another one to recursively check the subtree of that node