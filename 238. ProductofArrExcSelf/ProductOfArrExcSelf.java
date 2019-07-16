public class ProductOfArrExcSelf {
    public int[] productExceptSelf(int[] nums) {
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
