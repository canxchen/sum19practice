import java.util.HashMap;
public class validAnagram {
    public boolean isAnagram(String s, String t) {
        if (s==null||t==null||s.length()!=t.length())return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
        char curr;
        for (int i = 0; i < t.length(); i++) {
            curr = t.charAt(i);
            if (!map.containsKey(curr) || (map.get(curr) == 0)) return false;
            map.put(curr,map.get(curr)-1);
        }
        return true;
        //this solution takes advantage of ascii: rmb, character - 'a' is its index, mod 26
        /*
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
        */
    }
}
