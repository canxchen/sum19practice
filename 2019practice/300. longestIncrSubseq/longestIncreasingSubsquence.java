public class longestIncreasingSubsquence {
    public int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        int[] lengths = new int[nums.length];
        int size=0;
        for (int curr : nums) {
            int left = 0; int right = size;
            while(left != right){
                int mid = (left+right)/2;
                if (lengths[mid]<curr)
                    left=mid+1; //go right
                else
                    right = mid;
            }
            lengths[left]=curr;
            if(left==size) size++;
        }
        return size;
    }
    /*public int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        int[] dp = new int[nums.length];dp[0]=1;
        //dp[i] => longest increasing subseuqnece that ends at that index
        int max = 1;
        //for all items in list
        for (int i = 1; i < nums.length; i++) {

            //for all items that were before the current item from ^
            for (int j = i-1; j >= 0; j--) {
                //if before_item < curr_item
                if (nums[j]<nums[i]){
                    //update the length of the subsequence, if it applies
                    dp[i] = dp[j]+1 > dp[i] ? dp[j]+1 : dp[i];
                }
            }
            //if no smaller item was found, set dp[i] as 1
            if (dp[i]==0) dp[i]=1;
            max=max>dp[i]?max:dp[i];
        }
        return max;
    }*/
}
