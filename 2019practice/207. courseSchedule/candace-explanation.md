#  WRITE UP
[207. Course Schedule](https://leetcode.com/problems/course-schedule/)<br/>

## Problem: 
There are a total of n courses you have to take, labeled from 0 to n-1.

Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

Example 1:

Input: 2, [[1,0]] 
Output: true
Explanation: There are a total of 2 courses to take. 
             To take course 1 you should have finished course 0. So it is possible.
Example 2:

Input: 2, [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
             To take course 1 you should have finished course 0, and to take course 0 you should
             also have finished course 1. So it is impossible.
Note:

The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.
You may assume that there are no duplicate edges in the input prerequisites.


## Initial Insights
1. if, at any point, an edge in the graph comes back to itself, there is no possible way to take da courses.
2. took a peek at the related topics, saw topological sort, flashback to 351! (oof gotta review that stuff)

## Solution:
1. no dfs/bfs needed, just go through the array, and at each point, put the edge in the hashmap
2. check if curr is in hashmap + add if not, and return if yes.

Time: O(E) where e is number of edges (traverse whole list)

Space: O(E) where e is number of edges (store in hashmap)

## Learned:
1. review [topological sort](https://en.wikipedia.org/wiki/Topological_sorting) 
2. getter for hashmaps in java returns null when the key is not found!! gotta check for that.