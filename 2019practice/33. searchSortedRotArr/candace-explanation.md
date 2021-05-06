#  WRITE UP
https://leetcode.com/problems/search-in-rotated-sorted-array/

## Problem: 
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4


Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

## Initial Insights
1. ive done search rotated before should b cake

## Solution:
1. twas not cake
2. two cases: rotated or not
    1. if rotated, check if the values at the boundary of ur search box are < or > the target, and move accordingly (ie. in above, see that its rotated, 4 > 2, 4 > target = 0, so go right)
    2. if not rotated, normal bst rules apply

Time: O(logn)

Space: O(1)


## Learned:
1.  WHEN UR FUCKING RECRUSING DONT FUCKING LOOK AT INDICES THATY OUVE SEEN BEFORE!!! specifically, when resizing box to look at right side, dont include right in the new box u already looked at it! make left=mid+1 ya clown