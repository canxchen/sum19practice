import java.util.*;
public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean answer = false;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return answer;
    }
}
