import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        if (strs==null||strs.length==0) return ans;
        int key;
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] chars = new int[26];
            for (char c : strs[i].toCharArray())
                chars[c-'a']++;
            key=Arrays.hashCode(chars);
            if (map.containsKey(key))
                map.get(key).add(strs[i]);
            else{
                ArrayList<String> added = new ArrayList<>();
                added.add(strs[i]); map.put(key, added);
            }
        }
        for (int currkey : map.keySet()) {
            ans.add(map.get(currkey));
        }
        return ans;
    }
}
