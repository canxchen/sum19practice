#  WRITE UP
[371. Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/)<br/>

## Problem: 
Given a non-empty binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

Example 1:

Input: [1,2,3]

       1
      / \
     2   3

Output: 6
Example 2:

Input: [-10,9,20,null,null,15,7]

   -10
   / \
  9  20
    /  \
   15   7

Output: 42

## Initial Insights
1. recursive solution

## Solution:
1. at each node: get left, get right (both of which will interact with the global variable max_value).
2. now max_value has the biggest of left and right.
3. check if include the branch in the mix would be good: rightbranch,leftbranch,or curr+right+left
    1. why not curr+right or curr+left
4. set maxValue now, according to the max value u got in 3
5. return not the max value, but Math(left,right)+curr.val

Time: 

Space: 


## Learned:
1. 