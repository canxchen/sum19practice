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
1. obviously immediately thought of 2sum, and how the solution for that problem wont work bc need to gather all combinations of 2 of the array to make it work. (go thru, add up all 2 combos, add to set, do it the 2sum way, O(n ^ 2))
2. 2 pointers: for loop, and 2 pointers that go out (triple nested loop)
3. after 1273o82 minutes, realized that if 0 - ele1 + ele2 is not in the array, then can throw away the combo. 

## Solution:
1. HashMap<Integer, Integer> where Key = nums[i] and Value = i
2. nested for loop: for each nums[i] and nums[j], check if 0 - nums[i] -nums[j] is in HashMap
    1. if yes, check that all 3 indices are unique, and then add it to the answer arraylist.

Time: O(N ^ 2): nested forloop

Space: O(N): Hashmap


## Learned:
1. while coding i forgot about checking that all 2 indices are unique, 
  1. go over problem requirements extensively during the planning stage
  2. have a planning stage that isnt just putting comments in the code
  3. remember that all of this is normally done verbally, everytime u get a slive of an idea say it outloud.