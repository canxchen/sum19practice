#  WRITE UP
https://leetcode.com/problems/climbing-stairs/

## Problem: 
You are climbing a staircase. It takes n steps to reach to the top.

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
1. identical to the currency exchange problem. at each step, store answer for using all options. initial attempt was a recursive one that would double count certain combinations, so storing attempted tries is absolutely necessary.
2. reviewed discussions, caught on to the whole branching thing but it wasnt applied in the way that i thought it would: tho the tree goes down, the branching is applied in that each value can be reached in 2 ways: +1 or +2 from 2 immediate previous numbers. so you set up vars for 0, 1, and 2, and create the possible ways for each step from there.


## Solution:
1. set up int for total, one_before, two_before.
2. starting at 2, move to n, and at each point: total is one_before + two_before, reset both values

Time: O(N)

Space: O(1)


## Learned:
1. edge cases: 0, 1, 2, handle em before you reach the meat of ur implementation
2. identify the recurrence! kind of did that with branching