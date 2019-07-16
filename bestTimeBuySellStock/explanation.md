#  WRITE UP

## Problem: 
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.


## Initial Insights
1. just gotta find the max and min number that are contiguous, and get the max's index
2. how to make sure they are contiguous??? keep going for thru the loop and dont look back!
    i. aka set the __minimum__ value first, and treat curr as a candidate for __max__
3. this is a play on kadanes algorithm, which is used to find the [maximum subarray problem](https://en.wikipedia.org/wiki/Maximum_subarray_problem). 
    ` def maxSubArray(nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for i in range(1, len(nums)):
                if nums[i-1] > 0:
                    nums[i] += nums[i-1]
     return max(nums)`

## Solution:
1. for loop: check if current vlaue - min is > maxprofit
2. if it is, reset max profit!
3. THEN reset min if you have to (check current value)
4. keep goin

1. also u could just nest 2 forloops and generate all posisbilities and check
