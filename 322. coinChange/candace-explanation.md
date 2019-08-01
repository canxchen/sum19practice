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

## steps to dp
1. check if dp problem: cna assemble answer from smaller answers?
2. look for the things that change with each iteration + identify subproblems
3. build the relation
4. find edge/base cases
5. build recursive solution
6. include memoization in recursive solution (add values before return statements)

## followin da steps
1. it was in tha dp section so yes
2. what changes: the __amount__, and (less often) the number of coins that you can use
3. recurrence relation: the minimum steps required to reach curr_min_#_steps is: min(min_num_steps(amount-coin1), min_num_steps(amount-coin2), min_num_steps(amount-coin3))
4. edge case: reach the lowest number of money

## Initial Insights
1. this is a riff on the "num steps" problem and the base concept is the same! at each step, the tree branches in k directions (where k is the length of the input array)
2. recurrence: at each point, the number could have been created to/reached from k different numbers
3. can't do a greedy approach, and accept the immediately best answer: 75 = 50 + (25 x 1), or 3 x 25. prob actually have to generate all possibilities and keep the best one

## Solution (this might be nonsensical RIP) :
1. iterative! array of the minimum coin exchanges, __index = coin_amount__, __dp[index] = minimum_coin_exchanges__, fill array via double for loop: outer = go through all numbers, inner = go through all coins.
2. at each point, do:
    1. check if curr_number - curr_coin is >= 0 (ie within range of the dp array)
        1. if yes, check that curr_number - curr_coin < curr_min && != -1, reset if true.
        2. if no: check that it is a coin in array: if yes, dp[i] = 1; dp[i] = -1

Time: O(NM): N is amount, M is num coins

Space: O(N)

## Learned:
1. CHECK UR INDICES!!! write down, in comments, what you are trying to access. what the array indices are, what the elements at that index are. 
2. check terminating sequences: i was not setting the array to -1 where i should have been: initialize it to all -1's? or just when the loop hits it, put it as -1 
3. for if statements: think about what the conditions would be if it were true or false, and think about what should be done in those cases!!!
4. think bro


-solution an be expressed as FUNCTION of solutions to smaller problems? (build answer from smaller answers?)
-stopping @ curr? = can stop at next point?
-what changes with each "iteration" (# changing parameters, # subproblems)
-assuming subproblems are completed, how to related to "current"/main problem
-