#  WRITE UP
[300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)<br/>

## Problem: 
Given an unsorted array of integers, find the length of longest increasing subsequence.

Example:

Input: [10,9,2,5,3,7,101,18]
Output: 4 
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 
Note:

There may be more than one LIS combination, it is only necessary for you to return the length.
Your algorithm should run in O(n2) complexity.
Follow up: Could you improve it to O(n log n) time complexity?

## Initial Insights
1. dp: go forwards, but at each point, go all the way backwards to 0 and look for 1. a val < curr 2. the longest substring of those vals
2. dp[i] = longest increasing subsquence that ends at i

## Solution:
1. instantiate dp array
2. for i to rest of charactesr
3.  for j=i-1; j>=0; j--    check if j < i. check if dp[j]+1 > dp[i] (this is 0 at stsart, and keeps updating)

1. O(nlogn): ofc when u see nlogn u think tree: binary tree? min/mxheap? 
2. nope: this is another case where you dont have to do binary search on the element themselves, but something else thats related to the the result that you have to return.
3. do binary search on the list of the ENDS of longest increasing subsquence of each length: tails[i]=#. i=length, #=biggest number
4. find where the current value should fit. keep decreasing the size of the box (left, right) until the box is just one (left==right) 
5. ie if len=1: [1] <br/>
len=2: [1,2]<br/>
len=3: [1,3,4]<br/>
len=4: [1,3,5,6]<br/>
inserting 3: mid=3. 3<4,goleft right=mid |||| mid=2 3>4 goright left=mid+1. left==right, loop stops

if the value is beyond bounds, it will fall of the list and you can add it to the end. if its the smalleset, box will reduce to one elemento n the first element. overwrite it

Time: 

Space: O(N)


## Learned:
1. BINARY SEARCH DOESNT HAVE TO BE DONE ON THE VALUES THEM SELVES. what do you need. what are the facts: the longest subsqueence will always take a value bigger than curr, but is the SMALLEST of those value. 