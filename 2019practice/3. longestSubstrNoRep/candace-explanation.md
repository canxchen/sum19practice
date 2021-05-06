#  WRITE UP
[3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)<br/>

## Problem: 
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

## Initial Insights
1. this reminds me of the "subarray with largest summation" problem
2. O(N^2) solution, nested for loop, outer moves along each letter, inner moves along each letter starting from that point. 
3. dp solution: i=position, dp[i] = max subarray at that point; dp[i] = dp[i-1] + 1 if its a new character.

## Solution:
1. cache: set of seen chars, if seen already empty set and readd curr char, else add to set

Time: O(N)

Space: O(N)


## Learned:
1. set.add() returns a boolean
2. once you clear the set add the current hcaracter as seen!!!