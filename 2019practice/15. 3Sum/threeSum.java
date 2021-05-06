import java.util.*;
public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        if (nums == null || nums.length == 0 || (nums.length == 1 && nums[0] != 0) ) {
            return new ArrayList<List<Integer>>(ans);
        }
        HashMap<Integer, Integer> items = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            items.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (items.containsKey(0 - nums[i] - nums[j])) {
                    ArrayList<Integer> toAdd = new ArrayList<>();
                    toAdd.add(nums[i]);toAdd.add(nums[j]);toAdd.add(0 - nums[i] - nums[j]);
                    ans.add(toAdd);
                }
            }
        }
        return new ArrayList<List<Integer>>(ans);
        /*
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[] tmp = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //avoid using hte numbers that are used in these
                tmp[0]=i;tmp[1]=j;
            }
        }
        */

        //Set<Integer> set = new HashSet<Integer>(Arrays.asList(nums));
        //sets? hashmaps? pointers??
        //go thru, nested 2 for loops, generate all possible 2sums
    }
}
