#  WRITE UP
https://leetcode.com/problems/climbing-stairs/

## Problem: 
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

## Initial Insights
1. I did smth like this for practice earlier this yr, and i used separately instantiated variables to keep track of one element per list, and iterate through all of them slowly. not possible here (?), thought about nested for loops: for all lists, go through all elements the same way, but that can't work (still need ousitde variables)
2. peeked in on the category: heaps, so a solution could be to just insert all elements in a min heap and create a new list like that.

## Solution:
1. 

Time: 

Space: 


## Learned:
1. 