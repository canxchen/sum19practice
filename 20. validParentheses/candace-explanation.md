#  WRITE UP
[20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)<br/>

## Problem: 
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true

## Initial Insights
1. stack

## Solution:
1. stack: when u see ({[ push it on. if not these chars, pop the stack and check that it matches.

Time: O(N)

Space: O(N)


## Learned:
1. edge cases: one element? return false. i just returned true on exiting hte forloop, but if there it unpaired stuff in the stack, it shouldnt be true