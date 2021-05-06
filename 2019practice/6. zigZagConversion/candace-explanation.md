#  WRITE UP
https://leetcode.com/problems/maximum-subarray/

## Problem: 
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I



## Initial Insights
1. at first i saw the example strings and thought of 2d matrices but had the feeling that it was wrong + rlly annoying to do.
2. saw that the characters that are the diagonal "zigs" always shared 2 characters with 2 different rows, and the rest are just the intermediary characters, and thought about doing an implementation that relies on the cycle of characters

1P 2A 3Y 4P 5A 6L 7I 8S 9H 10I 11R 12I 13N 14G

numRows = 4

row 1: 1P, 7I, 13N
row 2: 2A, 6L, 8S, 12I, 14G
row 3: 3Y, 5A, 9H, 11R
row 4: 4P, 10I
pattern is every 4 characters?


ended doing: arraylist of strings, each index for each row. for loop going through each char, inserting it where it should go

## Solution:
1. set up arraylist with as many empty string elements as there are numRows
2. init int and bool variable, to keep track of the cycle from 0 to numRows and from numRows to 0
3. for loop: for each char, insert to the corresponding "row" (actually an index in the arraylist) according to the int variable set up in #2
4. concat everything! return

Time: O(n), but with multiple passthroughs

Space: O(n), must store the string another time (but in a diff order) with the arraylist. 


## Learned:
1. check for cycles before running to 2d arrays! i saw that hte example had the strings in what looked like 2d arrays, but rlly a cyclic cycle thing kept track of in an int was sufficient
2. string concatentaiton in java: just use the plus sign