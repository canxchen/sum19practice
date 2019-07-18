public class minSortedRotArr {
    public int findMin(int[] nums) {
        int ans = 0;
        if (nums == null || nums.length == 0)
            return ans;
        if (nums.length == 1)
            return nums[0];
        int left = 0; int right = nums.length - 1;
        int mid = (left + right) / 2;
        boolean notFound = true;
        while (notFound) {
            if (nums[left] > nums[right]) {
                //go right
                left = mid;
                mid = (left + right) / 2;
            } else if (nums[left] < nums[right]) {
                //go left
                right = mid;
                mid = (left + right) / 2;
            } else {
                //equsl
                return nums[left];
            }
        }
        return ans;
    }
}
