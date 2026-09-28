import java.util.ArrayList;

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
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        ArrayList<TreeNode> list = new ArrayList<>();
        preOrder(root, list);
        
        TreeNode dummy = new TreeNode(-1);
        TreeNode temp = dummy;
        for(int i = 0; i < list.size(); i++)
        {
            TreeNode curr = list.get(i);
            temp.right = curr;
            temp.left = null;
            temp = temp.right;
        }

        root = dummy.right;
    }

    public void preOrder(TreeNode root, ArrayList<TreeNode> list)
    {
        if(root == null)
            return;
        list.add(root);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}
    