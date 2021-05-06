#  WRITE UP
[128. Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)<br/>

## Problem: 
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Your algorithm should run in O(n) complexity.

Example:

Input: [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

## Initial Insights
1. saw the O(N) runtime and geeked. o(nlogn): put in binary tree, inorder, find +1 streak

## Solution:
1. add all elements to set
2. for all i in the array:
  1. check if curr+1 is in set. if yes, remove it from the set and keep going ++ until you cant find anymore
  2. reset curr = arr[i]
  3. check if curr-1 is in set. if yes, remove and keep going down
3. return the max vlaue that oyu were hopefully tracking

Time: O(N): you go thru all elements in the outer for loop, and in the inner while loops, you are capped out at O(N) bc ur are removing stuff from the set as you go, limiting the loops to N iterations.

Space: O(N)


## Learned:
1. just bc the runtime is O(N) doesnt mean you cant have nested for loops. you just have to cap out going thru the list from O(n^2), like here, the loop finishes when you go thru the amount of nums once.
2. looked it up,and i kinda wish i kept going at it, bc the solution is pretty straightforward and easy to come to