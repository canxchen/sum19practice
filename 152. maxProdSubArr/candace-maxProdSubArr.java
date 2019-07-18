public class maxProdSubArr {
    public int maxProduct(int[] nums) {
        int totmax = 0;
        if (nums == null || nums.length == 0)
            return totmax;
        int currmax = nums[0];
        totmax = currmax;
        boolean reset = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (currmax < 0 && totmax < 0) {
                    totmax = 0;
                }
                currmax = 1;
                reset = true;
            } else {
                currmax = currmax * nums[i];
            }
            if (!reset && currmax > totmax)
                totmax = currmax;
        }
        return totmax;
    }
}
