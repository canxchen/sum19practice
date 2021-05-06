import java.util.*;
public class minWindowSubstr {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0) return "";
        if (t.length() == 0) return s;
        HashMap<Character, Integer> map = new HashMap<>();
        char curr;
        int start = 0; int end = 0; int minlen = Integer.MIN_VALUE; int minStart = 0;
        int to_consume = t.length();

        //initialize hashmap with # times each letter appears
        for (int i = 0; i < t.length(); i++) {
            curr = t.charAt(i);
            if (map.containsKey(curr)) {
                map.put(curr, map.get(curr) + 1);
            } else {
                map.put(curr, 0);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),0);
            }
        }

        //iterate thru string
        while (end < s.length()) {
            curr = s.charAt(end);

            //if current_character has not yet been seen in this iteration
            //and it was in string t (which is why its in the map in the first place
            if (map.get(curr) > 0) {

                //one less character in t to look for
                to_consume--;
            }

            //one less instance of this character to look for (if its in string t
            //or if its in s, push it to the negatives
            map.put(curr,map.get(curr)-1);

            //move up the position in character for the string
            end++;

            //while we have consumed (seen) all letters in string t
            while(to_consume == 0) {
                //update min here, if current start and end are smaller than min
                if (start-end < minlen) {
                    minlen = start - end;
                    minStart = start;
                }

                //NOTE: if this character is in string t, it will be 0 before incrementing
                //if it is not in string t and in string s, it will be negative
                map.put(s.charAt(start), map.get(s.charAt(start)) + 1);

                //if the character at the beginning of current box
                //is fresh and unseen

                if (map.get(s.charAt(start)) > 0) {
                    //one more letter to consume
                    to_consume++;
                }
                start++;
            }
            //update maximum here
        }
        /*HashSet<Character> set = new HashSet<>();
        char curr;
        int max = -1; int start = 0; int end = 0;
        //window in s that contains all characters in t
        for (int i = 0; i < s.length(); i++) {
            //only one copy of each character
            curr = s.charAt(0);
            //pattern contains current character
            if (t.indexOf(curr) != -1) {
                if (!set.contains(curr)){
                    set.add(curr);
                    if (set.size() == t.length()) {
                        max = max > start - end + 1 ? max : start - end + 1;
                    }
                } else {
                    //already contains, move start pointer right until its valid
                    //find one valid characters
                }
            }
        }*/
        return "";
    }
}
