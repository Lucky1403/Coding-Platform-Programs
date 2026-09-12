import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Pair{
    Node node;
    int level;
    Pair(Node node, int level)
    {
        this.node = node;
        this.level = level;
    }
}


class Solution {
    static Node startNode;
    static HashMap<Node, Node> map;
    
    public void dfs(Node root, int target)
    {
        if(root == null)
            return;
        if(root.data == target)
            startNode = root;
        if(root.left != null)
            map.put(root.left, root);
        if(root.right != null)
            map.put(root.right, root);
        dfs(root.left, target);
        dfs(root.right, target);
        
    }
    
    public int minTime(Node root, int target) {
        map = new HashMap<>();
        startNode = null;
        dfs(root, target);
        int time = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startNode, 0));
        
        HashSet<Node> burned = new HashSet<>();
        burned.add(startNode);
        
        while(q.size() > 0)
        {
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            time = Math.max(time, level);
            
            if(node.left != null && !burned.contains(node.left))
            {
                q.add(new Pair(node.left, level + 1));
                burned.add(node.left);
            }
            
            if(node.right != null && !burned.contains(node.right))
            {
                q.add(new Pair(node.right, level + 1));
                burned.add(node.right);
            }
            
            if(map.containsKey(node) && !burned.contains(map.get(node)))
            {
                q.add(new Pair(map.get(node), level + 1));
                burned.add(map.get(node));
            }
        }
        return time;
    }
}