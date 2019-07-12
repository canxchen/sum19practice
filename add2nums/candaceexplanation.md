#  WRITE UP

## Problem: 
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

## Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)<br/>
Output: 7 -> 0 -> 8<br/>
Explanation: 342 + 465 = 807.<br/>

## Quick Insights:
1. Initial idea is to have a while loop that runs while both pointers.next != null, and add the values while storing the carry over in an outside variable.

## Solution:

