#  WRITE UP

## Problem: 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

## Quick Insights:
1. If you know two parts of an equation (in this case, the target and arr[i]), find the other part and leverage that somehow.
2. no dups and 1 solution!!!

## Solution:

This is pretty straightforward, if your interviewer considers lookups in hashmaps to be O(1) (not all do :(().
This is my final answer:
1. Put all elements in a hashmap, where value -> index
2. Iterate through the hashmap, and each point, check if target-curr_key is a key in the hashmap. if so, return an array with the two indices.

Didn't come up with the answer right away because I'm really rusty: thought of putting tuples in sets, then hashmaps where indices->values, and finally the above.


## Runtime and Space
Space: O(n), Time: O(n)

While the time is O(n), a maximum of two passes are made through the original array's elements: there was an implementation that, instead of adding elmeents to the hashmap and then checking if target-curr is contained. just does the putting in the hashmap and checks in one run. 

If target-currelement is not in the hashmap, curr element is put in the hashmap. if it is, the index of curr_element and the value to the key of target-currelement is returned in an array :OO

### Caveat: hashmap implementation
As for the lookup runtime, some interviewers may mention that different hashmap implementations can provide different runtimes, or just slow down the total runtime. 

[different hashmap implementations](https://en.wikipedia.org/wiki/Hash_table#Collision_resolution): 
1. separate chaining (and different data structures used for chaining, liked linked lists O(n), and self balancing binary search trees O(log n))
2. resizing buffer on each insertions/deletions as needed
3. open address:things are stored contiguously in a hashmap, may as well store all input with same keys right next to eachother with pointers to the next element.