#  WRITE UP

## Problem: 
Find median of 2 sorted arrays in O(log(m + n)) time. Issue lies in the runtime. The runtime actually gives a hint as to what the solution should be centered around: binary search. also im totally just regurgitating information from [this solution](https://medium.com/@hazemu/finding-the-median-of-2-sorted-arrays-in-logarithmic-time-1d3f2ecbeb46) for the purpose of learning via teaching

## Quick Insights:
    1. See "sorted array" and "log( some # )", immediately think of binary search.
    2. Median happens in the first half array, and is the largest of that chunk of the array.
    3. Solution should take into account these cases: 
        a. 1 empty list
        b. 2 lists with non overlapping ranges, ie. [1, 2, 3, 4, 5] and [6, 7, 8, 9, 10]
        c. 2 lists with overlapping ranges, ie, [1, 2, 6, 7] and [3, 4, 5] or [1, 2, 6] and [3, 4, 5, 7]

## Steps to Solution:

Building off of Quick Insights™ #2, realize that you can actually construct the first chunk of the combined array made of both arrays (which i am now calling the Monster Array™ bc i dont wanna type that everytime) by taking some combination of elements from each array. (if the list is even, the median would be the largest value of the element one position past the middle.) you could take 0, 1, 2, or all elements from one list, and all, all - 1, all - 2, ...0, elements from the other. the question is how much you do take from each?? and how do you decide that all within the O(log(m + n)) constraint??


### Pinpointing What to Recurse On

wwELOP to start off, we know the size of the first half of Monster Array™ and we can check if it exceeds the size f either array. We can determine the min/max values that each array can contribute. Quick Insights™ #3a is taken care of here- if 1 list is empty, just take the median of the other here and return da answer.

In other cases, (ie 1. both lists lengths are >= first half of Monster Array™ 2. one list is smaller [both lists being shorter than the first half is impossible]), the min/max number of elements that both lists can contribute is fixed.

IE:

A = [4, 20, 32, 50, 55, 61]  A.length = 6

B = [1, 15, 22, 30, 70]  B.length = 5

A U B = [1, 4, 15, 20, 22, 30, 32, 50, 55, 61, 70]  (A U B).length = 11

median is 30, the 6th element in A U B. 


B can contribute min = 0, max = 5 values. A can contributed min = 1, max = 6 values. 


Heres where the binary search kicks in!! So you cant do binary search on the ocmbined arrya, bc then youd have to combine it and that would already surpass the O(log(m + n))limit. SO!! ya do binary search on the min/max # of values that can be chosen. this search is done only --one-- of the the range of values, not both, because you can subtract from the length of half of Monster Array to find out how much the other contributes. 

For example, A can contribute min = 1, max = 6 values. First the search will look at 3, and move left or right as the search sees fit.


SO how do you know when and how to recurse? how do you even determine if the current # of contributions is the correct one and you have the correct median and you can stop de recursion?????

It's insultingly simple!! seriously i am OUTRAGED.

### Stopping Recursion
SO, we've established beforehand that the median would be the largest value of HALF of Monster Array™. Say you've found the median! it's the last element in B. call this median "b". The last element in A is "a". If b is the median, a < b because b should be the largest element. 

It's not enough to just check that a < b, though. Say the next element in A, immediately after a, is aa. a < aa because this is a sorted array. b must ALSO be < aa. Why??? Because, if aa < b, that means that the order would be a < aa < b. So, if you look back at the WHOLE Monster Array™ (not the first half that we were constructing with recursion), and choose the middle section that we're focusing in on, you'd be looking at [a, aa, b], and you'd see choosing b just because a < b would be wrong!!!

And so, we must ALWAYS CHECK, if a < b < aa, or (vice versa) b < a < bb. If this condition is met, you've found the median!!!

### When to Recurse
We answered 1 question, which is when to stop the recursion. so when do you recurse left or right? back to my example with the shittily named variables.

If you pick b as the median, and check to see if a < b < aa, and see that its not true and it is actually a < aa < b, you make 1 immediate choice: aa could be the median, and so you gotta increase the # values contributed by A and decrease the contributions made by B. Say you picked 3 contributions from 1 to 6 for A, then you to 3 to 6, you know how this works.

Vice versa would be true: is b < bb < a, decrease A's contributions and increase B's contributions....

OK das it, i recommend drawing it out/looking at [the original solution](https://medium.com/@hazemu/finding-the-median-of-2-sorted-arrays-in-logarithmic-time-1d3f2ecbeb46) bc it has diagrams!! 