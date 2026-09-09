import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node, int level)
    {
        this.node = node;
        this.level = level;
    }
}

class Solution {
    static TreeNode startNode;
    static  HashMap<TreeNode, TreeNode> map;
    public int amountOfTime(TreeNode root, int start) {
        map = new HashMap<>();
        startNode = null;
        dfs(root, start);
        int time = 0;
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startNode, 0));
        HashSet<TreeNode> burned = new HashSet<>();
        burned.add(startNode);
        while(q.size() > 0)
        {
            Pair front = q.remove();
            TreeNode node = front.node;
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

    public void dfs(TreeNode root, int target) {
        if(root == null)
            return;
        if(root.val == target)
            startNode = root;
        if(root.left != null)
            map.put(root.left, root);
        if(root.right != null)
            map.put(root.right, root);
        dfs(root.left, target);
        dfs(root.right, target);
    }
}