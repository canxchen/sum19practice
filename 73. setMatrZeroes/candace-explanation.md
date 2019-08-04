#  WRITE UP
[73. Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)<br/>

## Problem: 
Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

Example 1:

Input: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
Example 2:

Input: 
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
Output: 
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]
Follow up:

A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?

## Initial Insights
1. bruteforce! O(MN), when encounter a 0, replace array with a 0 array
2. looked at followups, oops. inplace, and O(M + N) runtime caught me. it looks like most other runtimes are O(MN anways): they go thru all of the elements. oof, misread the problem: it was O(M+N) and O(MN) space, of course you'd have to look at all the elements to see whether they are 0 or not. so how?
3. use initial values of rows + columns to keep track of if that element influencs the array. ONLY THE TOP LEFT CORNER WILL BE UNTOUNCHED

## Solution:
1. check the first row and column, and store whether or not they have 0's in 2 separate boolean variables.
2. from i = 1, j = 1 [i][j], go forth into the array! and check if each index has a 0: if they do, set [i][0] and [0][j] as 0
  1. note: if we did not use separate values for first row and first column, we would have to first set those rows and columns to 0's (and if we didnt set those first row and columns to 0's, we would not have been able to store the information for the rest of the row and columns correctly (because say u find ij==0, and set [0][1]==0 without checking if it was a 0 first, youd have to set both row and column to 0s which might be inaccurate yeah they sharea column, but should that first row really be all 0s? NOPE))
  2. ALSO we can totally fill in row by row and then column by column, because all the marker information is in the first rows and columns, which are not covered by the forloops. just gotta maek a separate for loop for that. 
  3. also the first element of that row/column will be filled by the dlag
3. fill in the first row and column with 0s if they already had 0s. u look at the code and say, wait, both are only filling in in one direction, what about the other? if the first row/column had a 0, it would have been seen in the previous nested forloop and interpreted as a flag, and would have been filled out as a part of that loop.

Time: O(MN)

Space: O(1)


## Learned:
1. write stuff down, i thought all flags started on 1,1 thats not the case
2. also got rlly confused during the process, about when indices would be filled, etcetc. walk thru exapmle to make sure.