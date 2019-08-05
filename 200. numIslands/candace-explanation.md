#  WRITE UP
[200. Number of Islands](https://leetcode.com/problems/number-of-islands/)<br/>

## Problem: 
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1


Example 2:

Input:
11000
11000
00100
00011

Output: 3

## Initial Insights
1. dfs! but how to know that you are currently on an island?
2. dfs will return true if it finds an island and false if it does not. so return true when u set visited to true. the first 1 you find signifies that there is an island, and itll return 1 to signify all the 1's that you reached

## Solution:
1. dfs: for all numbers in grid, do dfs. if dfs returns as true, increment hte number of islands you find

Time: O(MN)

Space: O(MN)


## Learned:
1. u can use the grid that you're given as a marker array! if 1. ur allowed to change the input array 2. dont care about legibility
2. this is known as sinking the islands as you go! :D