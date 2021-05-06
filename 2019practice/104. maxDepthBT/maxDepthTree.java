public class maxDepthTree {
    /**
     * Definition for a binary tree node.
     * public
     */

    public static void main(String args[]) {
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);

        head.right = new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);
        System.out.println(maxDepth(head));
    }

        public static int maxDepth(TreeNode root) {
            if (root == null) return 0;
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1 + ( left > right ? left : right );
        }
}

class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
}
