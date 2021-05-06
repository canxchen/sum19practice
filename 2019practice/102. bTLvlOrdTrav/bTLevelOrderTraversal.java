import java.util.ArrayList;
import java.util.List;

public class bTLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        addToList(ans,1,root);
        return ans;
    }
    //each leevel is the height: just check if the right level exists, then insert
    public void addToList(List<List<Integer>> ans, int curr_h, TreeNode curr) {
        if (curr == null) return;
        if (ans.size()<curr_h){ //0, 1
            ans.add(new ArrayList<Integer>());
        }
        ans.get(curr_h-1).add(curr.val);
        addToList(ans,curr_h+1,curr.left);
        addToList(ans,curr_h+1,curr.right);
    }

    /*public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        int h = height(root);
        for (int i = 0; i < h; i++)
            ans.add(new ArrayList<Integer>());
        addToList(ans,0,root);
        return ans;
    }
    public void addToList(List<List<Integer>> ans, int curr_h, TreeNode curr) {
        if (curr == null) return;
        ans.get(curr_h).add(curr.val);
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }*/
}
