#  WRITE UP

## Problem: 
Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1, 2, 3, 4]
Output: [24, 12, 8, 6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)


## Initial Insights
1. immediately want to just do sliding window with division but thats not allowed, and ofc second thought was to increase runtime to n^2 but that's also not allowed...
2. 3rd idea! construct 2 arrays, in both ways of the array: for __forwards__, each element has all the values before it multiplied with itself, and for __backwards__, same idea but starting from the last element and marching to 0. populate answer array[i] with forwards[i-1] * backwards[i+1], and take care of the edge cases

## Solution:
1. covered it in insight #2! the runtime is technically O(N), and the space is also O(N). To addr the follow up question?
    1. thought of storing the forwards and calculating answer[i] during the backwards loop but space stays the same
    2. thought of calculating both on the fly but that brings it back to n^2
    3. on looking for the answer and getting a glimpse of one, remembered that the result array is not a part of space considerations, can use that to store the forwards and then on the back wards array, adjust the values (might need extra variable to store one off values)
    4. so final solution: going forward, store the accumulated multiplicated values in the resulting array, and going backwards, hold the multiplied values starting from the end in a variable and multiply it back in.
