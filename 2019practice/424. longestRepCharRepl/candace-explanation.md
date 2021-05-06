#  WRITE UP
[424. Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/)<br/>

## Problem: 
Given a string s that consists of only uppercase English letters, you can perform at most k operations on that string.

In one operation, you can choose any character of the string and change it to any other uppercase English character.

Find the length of the longest sub-string containing all repeating letters you can get after performing the above operations.

Note:
Both the string's length and k will not exceed 104.

Example 1:

Input:
s = "ABAB", k = 2

Output:
4

Explanation:
Replace the two 'A's with two 'B's or vice versa.
 

Example 2:

Input:
s = "AABABBA", k = 1

Output:
4

Explanation:
Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.

## Initial Insights
1. recursive: at each point, branch into both, and compare at return
2. sliding window: extend window when the number of good characters in current chain surpasses the max. if max + k at current <= size_of_window (start - end), shift window forward

## Solution:
1. used recursive solution

Time: 

Space: 


## Learned:
1. Since we are only interested in the longest valid substring, our sliding windows need not shrink, even if a window may cover an invalid substring. We either grow the window by appending one char on the right, or shift the whole window to the right by one. And we only grow the window when the count of the new char exceeds the historical max count (from a previous window that covers a valid substring).

That is, we do not need the accurate max count of the current window; we only care if the max count exceeds the historical max count; and that can only happen because of the new char.

Here's my implementation that's a bit shorter

public int characterReplacement(String s, int k)
{
    int[] count = new int[128];
    int max=0;
    int start=0;
    for(int end=0; end<s.length(); end++)
    {
        max = Math.max(max, ++count[s.charAt(end)]);
        if(max+k<=end-start)
            count[s.charAt(start++)]--;
    }
    return s.length()-start;
}

---

In case anyone is confused by this solution, here's another way of explaining it:

end-start+1 = size of the current window
maxCount = largest count of a single, unique character in the current window

The main equation is: end-start+1-maxCount

When end-start+1-maxCount == 0, then then the window is filled with only one character
When end-start+1-maxCount > 0, then we have characters in the window that are NOT the character that occurs the most. end-start+1-maxCount is equal to exactly the # of characters that are NOT the character that occurs the most in that window. Example: For a window "xxxyz", end-start+1-maxCount would equal 2. (maxCount is 3 and there are 2 characters here, "y" and "z" that are not "x" in the window.)

We are allowed to have at most k replacements in the window, so when end-start+1-maxCount > k, then there are more characters in the window than we can replace, and we need to shrink the window.

If we have window with "xxxy" and k = 1, that's fine because end-start+1-maxCount = 1, which is not > k. maxLength gets updated to 4.

But if we then find a "z" after, like "xxxyz", then we need to shrink the window because now end-start+1-maxCount = 2, and 2 > 1. The window becomes "xxyz".

maxCount may be invalid at some points, but this doesn't matter, because it was valid earlier in the string, and all that matters is finding the max window that occurred anywhere in the string. Additionally, it will expand if and only if enough repeating characters appear in the window to make it expand. So whenever it expands, it's a valid expansion.

Hope that helps.