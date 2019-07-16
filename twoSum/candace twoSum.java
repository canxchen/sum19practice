import java.util.*;

public class twoSum {
    /*Given an array of integers, return indices of the two numbers
    such that they add up to a specific target.
    You may assume that each input would have exactly
    one solution, and you may not use the same element twice.
    **/
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                answer[0] = map.get(target-nums[i]);
                answer[1] = i;
                return answer;
            }
            map.put(nums[i],i);
        }
        return answer;
    }
    /*
    * Given nums = [2, 7, 11, 15], target = 9,
    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
    **/
}
