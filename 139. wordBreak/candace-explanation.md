#  WRITE UP
[139. Word Break](https://leetcode.com/problems/word-break/)<br/>

## Problem: 
Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

Note:

The same word in the dictionary may be reused multiple times in the segmentation.
You may assume the dictionary does not contain duplicate words.
Example 1:

Input: s = "leetcode", wordDict = ["leet", "code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple", "pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
             Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
Output: false

## Initial Insights
1. recursive implementation first- i think i got the logicc right, it was just too much for the poor yeetcode servers 

## Solution:
1. boolean dp, string.length+1 for the 0 char basecase
2. for each position from 1 to stringlength: 
  1. for each word in the wordDictionary:
      1. is going backwards word.length possible? (is there a previous substring that we can reach starting from i and going through word?): if yes, continue. if not, stop here and move onto next word: <br /> a visual: __[previous substring]__ __[word]__ __[current position i]__
      2. is the previous substring that you can reach through word a valid substring? if yes, continue. if not, stop here
      3. is the actual set of characters between previous substring and current position == word? <br /> ie. __[prev substring]__ __[is this string valid?]__ __[current position]__ <br /> if yes, dp[i]=true, stop looking at words!! if no: keep looking for words

Time: O(NM)

Space: O(N)


## Learned:
1. panicked and forgot the dp solution steps:
  1. is it dp? is it recursive
  2. what is the relation? how do you build one intermediary answer/the final answer from previous answers? here: S: is S reachable through a word in wordDict to a substring that was also valid?
  3. what changes between those relations? here: the string
  4. edge cases! here its the 0 index: had trouble here. was checking i-len==-1, and then checking substring with i-len+1,len+1. which was wrong. bc 1. thats a lot of -1 and +1, 2. the method parameters are (start index, end INDEX __[not num chars]__)