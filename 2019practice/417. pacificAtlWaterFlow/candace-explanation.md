#  WRITE UP
[417. Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/)<br/>

## Problem: 
Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent, the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and bottom edges.

Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.

Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.

Note:

The order of returned grid coordinates does not matter.
Both m and n are less than 150.
 

Example:

Given the following 5x5 matrix:

  Pacific ~   ~   ~   ~   ~ 
       ~  1   2   2   3  (5) *
       ~  3   2   3  (4) (4) *
       ~  2   4  (5)  3   1  *
       ~ (6) (7)  1   4   5  *
       ~ (5)  1   1   2   4  *
          *   *   *   *   * Atlantic

Return:

[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).

## Initial Insights
1. arrays: can_reach_pacific, or can_reach_atlantic. instantiate all edges with their proper values. 

## Solution:
1. fillout canreachpac and canreachatl arrays from the appropriate directions (left to right for pac, right to left for atl), check in final forloop and print the indices

Time: O(MN)

Space: O(MN)


## Learned:
1.  CHECK FOR TYPOS: 
  1. both of ur checkinf atl and pac loops had typos, bc u copied em over. you were supposed to check for the previously filled indices and were instead checking for the current index
  2. u were decrementing the variables you used for keeping track of array lengths WHO DOES THAT!!!, yeah check that its i >= 0, i-- and not m m >= 0, m--