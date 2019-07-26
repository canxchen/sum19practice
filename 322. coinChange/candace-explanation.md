#  WRITE UP
[322. Coin Change](https://leetcode.com/problems/coin-change/)<br/>

[ya girl googled dynamic progrmaming how to approach](https://www.freecodecamp.org/news/follow-these-steps-to-solve-any-dynamic-programming-interview-problem-cc98e508cd0e/)<br/>

## Problem: 
You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:

Input: coins = [1, 2, 5], amount = 11
Output: 3 
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Note:
You may assume that you have an infinite number of each kind of coin.


k = coins.length


## Initial Insights
1. this is a riff on the "num steps" problem and the base concept is the same! at each step, the tree branches in k directions (where k is the length of the input array)
2. recurrence: at each point, the number could have been created to/reached from k different numbers
3. can't do a greedy approach, and accept the immediately best answer: 75 = 50 + (25 x 1), or 3 x 25. prob actually have to generate all possibilities and keep the best one

## Solution:
1. 

Time:

Space: 

## Learned:
1. 