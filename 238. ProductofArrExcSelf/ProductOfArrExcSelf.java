public class ProductOfArrExcSelf {
    //taking into consideration the constant space follow up question
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1)
            return new int[1];
        int[] answer = new int[nums.length];
        answer[0] = nums[0];
        //right now, at index i, the array holds everything before * nums[i]
        //includes nums[i]
        for (int i = 1; i < nums.length - 1; i++) {
            answer[i] = answer[i-1] * nums[i];
        }
        //2, 4 => 4, 2
        answer[answer.length - 1] = answer[answer.length - 2];
        int prevNum = nums[nums.length - 1];
        //should grab the previous number and multiply with the index before it
        for (int i = nums.length - 2; i > 0; i--) {
            answer[i] = answer[i - 1] * prevNum;
            prevNum = prevNum * nums[i];
        }
        answer[0] = prevNum;
        return answer;
    }

    public int[] productExceptSelfOld(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1)
            return new int[1];
        int[] answer = new int[nums.length];
        int[] forward = new int[nums.length]; forward[0] = nums[0];
        int[] backwards = new int[nums.length]; backwards[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            forward[i] = forward[i-1] * nums[i];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            backwards[i] = backwards[i+1] * nums[i];
        }
        answer[0] = backwards[1]; answer[answer.length - 1] = forward[forward.length - 2];
        for (int i = 1; i < answer.length - 1; i++) {
            answer[i] = forward[i-1] * backwards[i+1];
        }
        return answer;
    }
}
