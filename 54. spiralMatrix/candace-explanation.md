#  WRITE UP
[54. Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)<br/>

## Problem: 
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

## Initial Insights
1. i++,j++,i--,j--
2. wrangling that variables was harder than necessary

## Solution:
1. use variables that hold the current start and end of rows and columns.
2. for loops have a tmp variable that starts and ends with ^^ appropriate start and end, and the constant + nonchanging value is xx_end/start
3. now that that xx_end/start has already been added to the array, ++ or -- it to start at the next unchecked value
4. rinse and repeat

Time: O(N)

Space: O(N)


## Learned:
1. make ur life ewasier, if a variable used for a for loop has to be reused, just <= it
2. walk thru an example, catch onto what wolud help you