#  WRITE UP
https://leetcode.com/problems/maximum-product-subarray/

## Problem: 
Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

## Initial Insights
1. ofc u see maximium subarray and immediately think of maximum subarray sum, so i implemented it with maximum subarray solution: keep trak of current_max, which is the built array * curr element
2. ran into issues: 
    1. i wanted to let the ucrr_max to multipliable (ie not 0) when it runs into a 0. so i set the currmax to 1 after it hits 0. right after this line, i check if currmax is > totmax and update it. so how do u know when to actually reset totmax (and not do it when currmax was reset to accomodate possible future multiplication to non 0 items): use a flag!
    2. another issue: when to reset totmax to 0? if totmax was < 0, and current element is 0

## Solution:
1. maximum subarray solution, except check if curr == 0 and totmax < 0 (reset totmax here). multiply as u go, and if u find a > item, just reset totmax

Time: O(n): one pass thru array

Space: O(1): jus need a var to keep track of curr and one for totmax


## Learned:
1. CHECK EDGE CASES: all negative items, all positive items, a 0 thrown into all negatives, a zero thrown into all positives, a 0 thrown into a mix.
    1. all negs + 0: choose the 0
    2. all positive + 0: just multiply the thingies and if u hit a 0, set curr to 1
    3. a mix of bot hand a - and + and 0s: largest oculd be posi x posi or neg x neg, check if == 0, reset to 1 and set flag, and keep going