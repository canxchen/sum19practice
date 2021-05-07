#  WRITE UP
https://leetcode.com/problems/maximum-depth-of-binary-tree/

## Problem: 
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

1. The number of nodes in the tree is in the range [0, 104].
2. -100 <= Node.val <= 100

## Example:
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2
Example 3:

Input: root = []
Output: 0
Example 4:

Input: root = [0]
Output: 1

## Quick Insights:
1. This is a pretty easy problem so i want to use it to practice interviewing beste practices- namely, coming up with a brute force solution, walking through example inputs (normal, edge cases), going over time and space complexities, and identifying areas of improvement.
2. If i were to do this recursively, the edge case is empty tree. which i check for, in order to stop the looping on a non empty tree. if node is non null, return 1 + max of left and right.
3. function call stack makes the space complexity O(N), because you call the function once for every node. not great! of course, the time is also O(N) because you must go thru each node. to improve on the space complexity, go thru the tree iteratively. can i even do this iteratively? (of course) at each level, i need to go down left and right- idk which one is taller. to keep track of all the nodes i touch, i would need to acknowledge them right? by keeping track of them in a map- also O(N). so i can do it iteratively, there'd be a bit of trouble i need to go thru to correctly increment the height.

## Solution:
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
