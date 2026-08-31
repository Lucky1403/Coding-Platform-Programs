import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        if (root == null)
            return ans;
        levelOrderTraversal(root, ans);
        return ans;
    }

    public void levelOrderTraversal(TreeNode root, List<List<Integer>> ans) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> l1 = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode front = q.remove();
                l1.add(front.val);
                if (front.left != null)
                    q.add(front.left);
                if (front.right != null)
                    q.add(front.right);
            }
            ans.add(l1);
        }
    }
}