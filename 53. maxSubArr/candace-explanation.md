#  WRITE UP

## Problem: 
Given an integer array __nums__, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.


Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.


*A divide-and-conquer algorithm works by recursively breaking down a problem into two or more sub-problems of the same or related type, until these become simple enough to be solved directly.

## Initial Insights
1. First kind of considered a sliding window approach, but wasn't sure how to handle iterating all the different sized subarrays in O(n) time. 
2. Then considered a recursive approach, and wasn't sure how to handle the contiguous approach. Hung up on the contiguous part!!
3. gave in googled oop

## Solution:
1. instantiate 2 vars, total_max and max_so_far. max_so_far keeps track of the maximum summation using the current element in a for loop going through the array, and total_max keeps track of the biggest value
2. loop thru the array! for each value, 
    1. add it to max_so_far. if max_so_far < 0, discard it by resetting max_so_far to 0. 
    2. check if max_so_far > total_max. if yes, reset max_so_far.

still having trouble understanding how exactly it works? was hungup on how you evaluate sub arrays of the currently evaluated array. 