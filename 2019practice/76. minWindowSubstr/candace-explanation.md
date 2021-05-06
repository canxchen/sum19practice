#  WRITE UP
[76. Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)<br/>

## Problem: 
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Example:

Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
Note:

If there is no such window in S that covers all characters in T, return the empty string "".
If there is such window, you are guaranteed that there will always be only one unique minimum window in S.

## Initial Insights
1. ??? something something sliding window
2. O(MN), z algorithm esque, fill an array with the positions of characters that match the pattern string
    1. but how would you advance the box? by finding the next character that isnt a repeat of the last string?? hashmap with indices??
3. looked up the solution to make this a ~learning experience
4. from what i understand, the general solution to something relating to min/max substring in a given string:
    1. create variables to hold: start + end [box holding substring], min/max length, counter (of valid characters/needed valid characters, a map (keep track of #characters in __pattern__ string) maybe a starting index
    2. fill the map with whatever initial values
    3. while (end < string.size())      end is currchar!
        1. check if map(end) is <> 0, adjust counter accordingly. no matter what, decrement the map(end) value
        2. increment end + 1
        3. while counter meets a condition
            1. *** adjust min value if you are looking for min
            2. (of variable order, depending on what you want): increment map(start), and check if it <> 0. ADJUST COUNTER HERE
            3. increment start + 1 (could be variable placement too)
        4. adjust max if you are looking for max
    5. return

## Solution:
1. start, end, map(character in t) -> num occurences, minstart, minlen, characters_from_t_to_consume (to_consume)
2. instantiate map with t characters->num occurences in t, and none t charactesr from s with 0
3. while end < t.length(), do:
    1. if map(end) > 0  ---> to_consume = to_consume - 1        one less character from t to look for
    2. map(end) = map(end) - 1                                  (happens no matter the current character, non t chars pushed to __negative__ #)
    3. end = end + 1                                            move up current character
    4. while counter == 0                                       //consumed all characters in t
        1. if (start - end < minLen): adjust minlen, minStart   make sure min is accurate
        2. map(start) = map(start) + 1                          make start a fresh character: t chars > 0, s chars <= 0 
        3. if (map(start)>0): to_consume++                      t chars > 0, so a fresh character to consume
        4. start++                                              move up the box
    5. make sure minlen has been setup, and return if it has

Time: O(N)

Space: O(N)


## Learned:
1. Good solution: 

`
string minWindow(string s, string t) {
	unordered_map<char, int> m;
	// Statistic for count of char in t
	for (auto c : t) m[c]++;
	// counter represents the number of chars of t to be found in s.
	size_t start = 0, end = 0, counter = t.size(), minStart = 0, minLen = INT_MAX;
	size_t size = s.size();
	
	// Move end to find a valid window.
	while (end < size) {
		// If char in s exists in t, decrease counter
		if (m[s[end]] > 0)
			counter--;
		// Decrease m[s[end]]. If char does not exist in t, m[s[end]] will be negative.
		m[s[end]]--;
		end++;
		// When we found a valid window, move start to find smaller window.
		while (counter == 0) {
			if (end - start < minLen) {
				minStart = start;
				minLen = end - start;
			}
			m[s[start]]++;
			// When char exists in t, increase counter.
			if (m[s[start]] > 0)
				counter++;
			start++;
		}
	}
	if (minLen != INT_MAX)
		return s.substr(minStart, minLen);
	return "";
}
`

2. general template of minmax substring in string: 
`
int findSubstring(string s){
        vector<int> map(128,0);
        int counter; // check whether the substring is valid
        int begin=0, end=0; //two pointers, one point to tail and one  head
        int d; //the length of substring

        for() { /* initialize the hash map here */ }

        while(end<s.size()){
            
            //mark curr as seen
            if(map[s[end++]]-- ?){  /* modify counter here */ }

            while(/* counter condition */){ 
                 
                 /* update d here if finding minimum*/

                //increase begin to make it invalid/valid again
                
                //mark charactesr at beginning of box as unseen, fresh new chars
                if(map[s[begin++]]++ ?){ /*modify counter here*/ }
            }  

            /* update d here if finding maximum*/
        }
        return d;
  }
  `