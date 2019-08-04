import java.util.LinkedList;
import java.util.Queue;
public class sameTree {
    //in order traversal
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        TreeNode curr; TreeNode currq;
        Queue<TreeNode> to_see = new LinkedList<>(); to_see.add(p);
        Queue<TreeNode> to_seeq = new LinkedList<>(); to_see.add(q);
        while (!to_see.isEmpty()) {
            curr = to_see.poll(); currq = to_seeq.poll();
            if (curr != currq)
                return false;
            if (curr.left!=null)
                to_see.add(curr.left);
            if (curr.right!=null)
                to_see.add(curr.right);
        }
        return 0 == to_seeq.size();
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
