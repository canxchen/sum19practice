import java.util.*;
public class cloneGraph {
    HashMap<Integer,Boolean> seen = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        //should be dfs, bc refs have to be accurate
        return helper(node);
    }

    public Node helper (Node n) {
        //dont process if seen: handled in for loop, dont want
        //to add null vlaues to the arraylist
        //if (seen.get(n.val)) return null;
        Node clone = new Node(); clone.val = n.val;
        clone.neighbors = new ArrayList<>();
        for (int i = 0; i < n.neighbors.size(); i++) {
            if (!seen.get(n.neighbors.get(i))) {
                clone.neighbors.add(helper(n.neighbors.get(i)));
            }
        }
        seen.put(clone.val,true);
        return clone;
    }
}

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {}
    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};