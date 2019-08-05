import java.util.LinkedList;
import java.util.Queue;

public class serAndDesBT {
    //faster
    /*private static final String spliter = ",";
    private static final String NN = "X";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }
    private void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NN).append(spliter);
        } else {
            sb.append(node.val).append(spliter);
            buildString(node.left, sb);
            buildString(node.right, sb);
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(nodes);
    }

    private TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals(NN)) return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }*/
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        Queue<TreeNode> q = new LinkedList<>(); q.offer(root);
        StringBuffer ans = new StringBuffer(); TreeNode curr;
        while (!q.isEmpty()) {
            curr = q.poll();
            if (curr.val == Integer.MIN_VALUE) {
                ans.append("n");ans.append(","); continue;
            }
            ans.append(curr.val);
            ans.append(",");
            if (curr.left != null) {q.offer(curr.left);} else {q.offer(new TreeNode(Integer.MIN_VALUE)); }
            if(curr.right != null) {q.offer(curr.right);} else {q.offer(new TreeNode(Integer.MIN_VALUE)); }
        }
        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) return null;
        String[] splitted = data.split(",");
        TreeNode head = new TreeNode(Integer.parseInt(splitted[0])); TreeNode curr = head; TreeNode left; TreeNode right;
        Queue<TreeNode> need_children = new LinkedList<>(); need_children.offer(curr);
        for (int i = 1; i < splitted.length - 1; i += 2) {//1,2,3
            curr = need_children.poll();

            if (!splitted[i].equals("n")) {
                left = curr.left = new TreeNode(Integer.parseInt(splitted[i]));
                need_children.add(left);
            }
            if (!splitted[i + 1].equals("n")) {
                right = curr.right = new TreeNode(Integer.parseInt(splitted[i + 1]));
                need_children.add(right);
            }
        }

        return head;
        //num nodes: 1, 2, 4, 8 etc
    }
}
