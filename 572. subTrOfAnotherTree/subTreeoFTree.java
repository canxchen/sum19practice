public class subTreeoFTree {
    //no duplicates:
    /*public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s==null&&t==null)return true;
        if (s==null || t==null)return false;
        TreeNode head = (findHead(s,t.val));
        return is(head,t);
    }
    public boolean is(TreeNode s, TreeNode t){
        if (s==null&&t==null)return true;
        if (s==null || t==null||s.val != t.val)return false;
        return is(s.right,t.right)&&is(s.left,t.left);
    }
    public TreeNode findHead(TreeNode s, int to_find) {
        if (s==null)return null;
        if (s.val == to_find) return s;
        TreeNode l = findHead(s.left, to_find);
        TreeNode r = findHead(s.right, to_find);
        return l==null? r : l;
    }*/
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s==null)return false;
        if (help(s,t)) return true;
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    public boolean help(TreeNode s, TreeNode t) {
        if (s==null&&t==null)return true;
        if (s==null || t==null)return false;
        return s.val==t.val&&help(s.left,t.left)&&help(s.right,t.right);
    }
}
