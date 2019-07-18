#  WRITE UP
https://leetcode.com/problems/3sum/

## Problem: 
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

## Initial Insights
1. obviously immediately thought of 2sum, and how the solution for that problem wont work bc need to gather all combinations of 2 of the array to make it work. (go thru, add up all 2 combos, add to set, do it the 2sum way)
2. 2 pointers: for loop, and 2 pointers that go out (triple nested loop)
3. after 1273o82 minutes, realized that if 0 - ele1 + ele2 is not in the array, then can throw away the combo. 

## Solution:
1. 

Time: 

Space: 


## Learned:
1. 