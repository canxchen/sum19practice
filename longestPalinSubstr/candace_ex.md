#  WRITE UP

## Problem: 
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.


Example 2:

Input: "cbbd"
Output: "bb"


## Initial Insights
1. The longest substring possible is the whole string itself. The next possible longest substring is 1 less than the length of the string, and so on until 2 chars is reached. dp?? storing and checking each half of the strings would take a crazy long runtime O(n^2)
    i. nested for loops: first indicates the starting point of the string to examine, and the second determines the ending point. for each iteration, check if the first section of the string matches the second.
    ii. another riff on the same idea with same runtime: have a for loop, and at each point, go outwards from that same point, one character at a time, and check if the characters match.
2. Different cases: odd (aba), even (baab)

## Solution:
#### Dumb/Not Ideal Way (my implementation)
1. null/empty check: if null or empty, return empty string
2. for loop: for each point in the string, check if any strings using the current character as the middle point are palindromes, and check if those palindromes are longer than the currently selected palindrome.
3. return the empty string if not found.

### the good way
linked [here](https://en.wikipedia.org/wiki/Longest_palindromic_substring "yeetus"), ill fill this out laterrrr 