#  WRITE UP
[link](https://leetcode.com/problems/set-matrix-zeroes/)

## Problem: 
Given an m x n matrix. If an element is 0, set its entire row and column to 0. Do it in-place.

###Constraints:

1. m == matrix.length (vertical)
2. n == matrix[0].length (horizontal)
3. 1 <= m, n <= 200
4. -231 <= matrix[i][j] <= 231 - 1


###Follow up:

A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?

## Example:
Example 1:

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]


Example 2:

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

## Quick Insights:
1. Misread the folloup points as time complexity instead of space and was like is it even possible to not go thru the whole matrix and know which ones are 0 or not? and ofc not. so because this algorithm is stupposed to be in place, the space complexity refers to the additional space that you use.
2. so that's a clue as to how we can do this! additional constraints say that O(M*N) is a bad idea- ofc, copying the input to another identical matrix is ass.
3. so i was thinking of using "2" to flag cells that need to be changed- but the array cells can have any integer
4. then i googled the problem trying to figure out what constant space complexity meant and then confirmed the above oops
5. what is the simple improvement that makes it O(M+N)???
6. so my attempted O(1) is (with help from google): use the first column and row as flags. if you run into a 0, make the top cell and left most cell 0, to signify that everything below, and to the right, respectively, needs to be 0.
7. ran into an error: when the upper 2 corners are 0, i use the first corner to set the entire row 0, and then i do the columns, at which point the columns are all 0 and so i set the entire matrix to 0's

## Solution:

CINOMPLETE AND NOT WORKING
class Solution {
    public void setZeroes(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    //if (col != matrix[0].length - 1) 
                    matrix[0][col] = 0;
                    matrix[row][0] = 0;
                }
            }
        }
        for (int row = 1; row  < matrix.length; row++) {
            if (matrix[row][0] == 0) {
                for (int col = 1; col < matrix[0].length; col++) {
                    matrix[row][col] = 0;
                }
            }
        }
        for (int col = 1; col < matrix[0].length; col++) {
            if (matrix[0][col] == 0) {
                for (int row = 1; row < matrix.length; row++) {
                    matrix[row][col] = 0;
                }
            }
        }
    }
}