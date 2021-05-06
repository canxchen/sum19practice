import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSubseq {
    public int longestConsecutive(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        Set<Integer> set = new HashSet<>();
        for (int a : nums)
            set.add(a);
        int i = 0; int curr; int max = 1; int currmax;
        while (i < nums.length && !set.isEmpty()) {
            curr = nums[i]; currmax = 1;set.remove(curr);
            while (set.contains(curr+1)) {
                set.remove(curr+1);
                currmax++;
                curr++;
            }
            curr=nums[i];
            while (set.contains(curr-1)) {
                set.remove(curr-1);
                currmax++;
                curr--;
            }
            i++;
            max=max>currmax?max:currmax;
        }
        return max;
    }
}
