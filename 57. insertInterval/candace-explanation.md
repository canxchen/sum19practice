#  WRITE UP
[57. Insert Interval](https://leetcode.com/problems/insert-interval/)<br/>

## Problem: 
Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:

Input: intervals = [ [1,3], [6,9]], newInterval = [2,5]
Output: [ [1,5], [6,9]]<br/>

Example 2:

Input: intervals = [ [1,2], [3,5], [6,7], [8,10], [12,16] ], newInterval = [4,8]
Output: [ [1,2], [3,10], [12,16] ]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].


## Initial Insights
1. binary search with extensive if checks
2. find where the first num is, find where the second num could be, readjust intervals
3. linear searching for first and last
4. delayed reaction: you can literally never create a new interval, unless the list is empty or something. an existing interval will always be created

## Solution:
1. look for first interval where smallest value is located in/can be shoved in
2. change the minimum value to the appropriate one. if the newInterval smallest value is actually the biggest value in the found_interval, dont change the max value. the max_value_of_new_interval will overtake it and be the new largest value of the new interval.
3. find location of the larger value in newInterval. get the max of newInterval_bigger and 2nd_found_interval, and reset the bigger vlaue of the first_found_interval to this vlaue.
4. its important that you dont add any intervals in step 3. the first_foud_interval will already have been added to the arraylist through the first forloop to find the first interval where intervals[0] > newInterval[0] (bc once this condition is met the loop stops, and the interval is already added. if its the first interval and hte loop doesnt enter, manually enter it)
5. add the rest
6. theres prob problems but im tired 

Time: O(N)

Space: O(N)


## Learned:
1. check edge cases, indices, what happens when things are 0, walk through examples on paper/by hand at first.