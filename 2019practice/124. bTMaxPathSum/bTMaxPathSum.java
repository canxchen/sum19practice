public class bTMaxPathSum {
    /*public int maxPathSum(TreeNode root) {
        //root, root+left, root+right, left, right, root+left+right
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.val;
        int left = maxPathSum(root.left);
        int right = maxPathSum(root.right);
        return Math.max(root.val, Math.max(left, Math.max(right, Math.max(root.val+left, Math.max(root.val+left, root.val+left+right)))) );
    }*/
    int maxValue;

    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue; //dont take waht the function returns, it includes the root when it might not
    }

    private int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(maxPathDown(node.left),0);
        int right = Math.max(maxPathDown(node.right),0);
        maxValue = Math.max(maxValue, node.val); //left branch, right branch fought it out in maxValue. compare to left + right + curr
        return Math.max(left,right)+node.val; //have to use current value for all traversals, so it includes it nomatter what
    }
}
