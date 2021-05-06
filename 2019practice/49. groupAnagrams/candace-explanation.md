#  WRITE UP
[49. Group Anagrams](https://leetcode.com/problems/group-anagrams/)<br/>

## Problem: 
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.


## Initial Insights
1. welp normally i yse hashmaps to get the match for anagrams, but like how to indiscrimnately make a bunch ofh hashmaps?
2. took a peak at solutions, just use a char array and use the Ararys.hashCode(array) to get access to a hashmap, add strings there

## Solution:
1. create hashmap
2. for each string, get the character-># occurences array (int[26]). GET HASHCODE: Arrays.hashCode(array). 
    1. ENTER THE STRING INTO the arraylist waiting at hashmap.get(arrays.hashCode(character_array))
3. gather the strings

Time: O(N)

Space: O(N) each character gets their own array, and each is spitted back out as an answer


## Learned:
1. Arrays.hashCode(array)
2. s.charAt(i) - 'a' = an index!
3. for (int currkey : map.keySet()): do stuff. keySet()