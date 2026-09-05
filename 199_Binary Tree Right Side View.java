import java.util.ArrayList;
import java.util.List;

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

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        view(root, 0, result);
        return result;
    }

    private void view(TreeNode root, int level, List<Integer> result) {
        if(root == null)
            return;
        if(level >= result.size())
            result.add(root.val);
        else
            result.set(level, root.val);
        view(root.left, level + 1, result);
        view(root.right, level + 1, result); 
    }
}