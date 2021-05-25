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
8. Final thought that I needed a hint to come up with: extra variables that take up the same space no matter the input (aka space that is unrelated to the input size, aka constant space) is alloweddddd for O(1) solutions 

## Solution:
for a normal/acceptable solution, use a hashset for rows and another for columns. when u run into a 0, take not of the row and column by putting them in their respective hash sets and fo thru the matrix again to set the zeroes O(M+N)

O(1) solution: use first row and column as flags (for each row, if 1st ele is 0, make whole row 0). go thru matrix twice: once for setting the flags, and another for setting 0s. for the edge case ([0][0] cell is 0, which would zero out the whole matrix)- just use it as a flag for one dimension, and an extra variable for the other dimension (ie use it as a row indicator, and check it before setting it for the column indicator)

class Solution {
    public void setZeroes(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int firstColVal = 1;
        
        //mark the first row and cols
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] == 0) {
                    //mark col
                    if (j != 0) {
                        //if not first col, mark the first cell
                        matrix[0][j] = 0;
                    } else {
                        //if first col (literal edge case) -mark the variable 
                        firstColVal = 0;
                    }
                    //mark row no matter what it is
                    matrix[i][0] = 0;
                }
            }
        }

        //for everything from [1][1] forward, check first row/col
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < numCols; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        //check corners: first, we do the first row: col changes but row does not
        if (matrix[0][0] == 0) {
            for (int i = 0; i < numCols; i++) {
                matrix[0][i] = 0;
            }
        }
        
        //then we do the first col: row changes but cols do not
        if (firstColVal == 0) {
            for (int i = 0; i < numRows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}