import java.util.*;
public class maxSubArray {
    /*
    * Initialize:
    max_so_far = 0
    max_ending_here = 0

    Loop for each element of the array
      (a) max_ending_here = max_ending_here + a[i]
      (b) if(max_ending_here < 0)
                max_ending_here = 0
      (c) if(max_so_far < max_ending_here)
                max_so_far = max_ending_here
    return max_so_far
    * */
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int ans = Integer.MIN_VALUE;
        int maxhere = 0;
        for (int i = 0; i < nums.length; i++) {
            //if you use current value as the last element in an array that started earlier
            //is it less than 0?
            //get rid of it if it is
            //why discard it? if its sub 0 in an array with positive values, it cant possibily b good
            //so what if the next value bumps it up? itcant: if its < 0, that element by itself without
                    //the list that u have now
            //so why dont u discard it earlier? the next value could add to this subarray! so keep going
            maxhere = maxhere + nums[i] > 0 ? maxhere + nums[i] : 0;
            ans = ans > maxhere ? ans : maxhere;
        }
        return ans;
    }
}

/*
recreating hte solution from scratch:

knowns:
-if positive integers are included in the array, the largest_contig_sum > 0
-if only negative integers, largest_contig_sum == largest num

 */