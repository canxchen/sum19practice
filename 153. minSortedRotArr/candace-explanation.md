#  WRITE UP
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

## Problem: 
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

You may assume no duplicate exists in the array.

Example 1:

Input: [3,4,5,1,2] 
Output: 1


Example 2:

Input: [4,5,6,7,0,1,2]
Output: 0

## Initial Insights
1. O(n) soltuion, just going through but that didnt feel right
2. and so of course, u gotta think of bst when seeing a sorted list with access to elements (array)

## Solution:
1. BST: to decide where to go, check if
    1. r < l, ie l=4 ..... 0, 1, r=2, gotta go right bc hte smaller values are on the right
    2. l < r, ie 0, 1, 2, ..... 4, gotta go left bc the smaller vlaues are on the left
    3. l == r, or the mid < l and r (DISPROVED: 6, 0, 1, 2, 3, 4, 5 :: 2 IS < 6 and 5 but not the min)

Time: O(logn)

Space: O(1)


## Learned:
1. WALK THROUGH EDGE/WEIRD CASES!!! here, its one rotation, half rotation, no rotation.