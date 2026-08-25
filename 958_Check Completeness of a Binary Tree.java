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
    public int size(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    public boolean checkCompleteness(TreeNode root, int idx, int sizeOfTree) {
        if (root == null) {
            return true;
        }
        if (idx > sizeOfTree) {
            return false;
        }
        return checkCompleteness(root.left, 2 * idx, sizeOfTree)
                && checkCompleteness(root.right, 2 * idx + 1, sizeOfTree);
    }

    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        int sizeOfTree = size(root);

        return checkCompleteness(root, 1, sizeOfTree);
    }
}