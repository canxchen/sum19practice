#  WRITE UP
[1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)<br/>

## Problem: 
Given two strings text1 and text2, return the length of their longest common subsequence.

A subsequence of a string is a new string generated from the original string with some characters(can be none) deleted without changing the relative order of the remaining characters. (eg, "ace" is a subsequence of "abcde" while "aec" is not). A common subsequence of two strings is a subsequence that is common to both strings.

If there is no common subsequence, return 0.


Example 1:
	Input:  "ABCD" and "EDCA"
	Output:  1
	
	Explanation:
	LCS is 'A' or  'D' or 'C'


Example 2:
	Input: "ABCD" and "EACB"
	Output:  2
	
	Explanation: 
	LCS is "AC"


 

Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:

Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Example 3:

Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.


## Initial Insights
1. ive done this before! dp: two dimensional, each [i][j] holds the longest common subsequence reachable by the numbers i and j that youve traverse thru string 1 and stirng 2, respectively. 
    1. come from diagonal: consume curr chars of both. 
    2. come from left: consume a char in the left-right string. 
    3. come from top: consume a character from the top-down string

## Solution:
1. outlined above! make sure that the forloops are within the correct indices

Time: O(NM)

Space: O(NM)


## Learned:
1. for loop edges?

public int longestCommonSubsequence(String text1, String text2) {
        if (text1==null||text2==null||text1.length()==0||text2.length()==0)return 0;
        int[][] dp = new int[text1.length()][text2.length()];
        for (int i = 0; i < text2.length(); i++) {
            if (text1.charAt(0)==text2.charAt(i))
                dp[0][i]=1;
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text2.charAt(0)==text1.charAt(i))
                dp[i][0]=1;
        }
        int max;
        for (int i = 1; i < text1.length(); i++) {
            for (int j = 1; j < text2.length(); j++) {
                max=Math.max(dp[i-1][j],Math.max(dp[i-1][j-1],dp[i][j-1]));
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i][j]=max+1;
                } else {
                    dp[i][j]=max;
                }
            }
        }
        return dp[text1.length()-1][text2.length()-1];
    }