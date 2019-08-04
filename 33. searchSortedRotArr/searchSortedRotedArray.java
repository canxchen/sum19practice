public class searchSortedRotedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0; int right = nums.length - 1; int mid = (left + right) / 2;

        while(left != right) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[left] > nums[right]) {
                //[4,5,6,7,0,1,2]

                if (nums[left] > target) {
                    left = mid + 1; mid = (left + right) / 2;
                } else {
                    right = mid - 1;  mid = (left + right) / 2;
                }
            } else {
                //[0,1,2,4,5,6,7]

                if (nums[mid] > target) {
                    right = mid - 1;  mid = (left + right) / 2;
                } else {
                    left = mid + 1; mid = (left + right) / 2;
                }
            }
        }
        return nums[left] == target ? left : -1;
    }
}
