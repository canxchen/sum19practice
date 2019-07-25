#  WRITE UP
https://leetcode.com/problems/clone-graph/

## Problem: 
Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph. Each node in the graph contains a val (int) and a list (List[Node]) of its neighbors.
 

Example: [image]

Input:
{"$id":"1","neighbors":[{"$id":"2","neighbors":[{"$ref":"1"},{"$id":"3","neighbors":[{"$ref":"2"},{"$id":"4","neighbors":[{"$ref":"3"},{"$ref":"1"}],"val":4}],"val":3}],"val":2},{"$ref":"4"}],"val":1}

Explanation:
Node 1's value is 1, and it has two neighbors: Node 2 and 4.
Node 2's value is 2, and it has two neighbors: Node 1 and 3.
Node 3's value is 3, and it has two neighbors: Node 2 and 4.
Node 4's value is 4, and it has two neighbors: Node 1 and 3.
 

Note:

The number of nodes will be between 1 and 100.
The undirected graph is a simple graph, which means no repeated edges and no self-loops in the graph.
Since the graph is undirected, if node p has node q as neighbor, then node q must have node p as neighbor too.
You must return the copy of the given node as a reference to the cloned graph.

## Initial Insights
1. graphs?? dfs and bfs!!
2. got caught up in the refeences: wasnt making notes when i was thinking, thinking about how the references in the list would be accurate for some reason confused me: just add htem to the arraylist via recursive call, which returns the node created (and adds it to the __newly created__ arraylist).


## Solution:
1. dfs: with a hashmap/set to check if items have been seen, and skip them if you have seen them.

Time: O(n) for all nodes

Space: O(n^2) for all node and connections


## Learned:
1. write yo notes down!! or talk it out!!! get outta ya head