public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean checkTree(TreeNode root) {
        int x = root.val;
        int y = 0;
        int z = 0;

        if (root.left != null) {
            y = root.left.val;
        }

        if (root.right != null) {
            z = root.right.val;
        }

        if (x == (y + z)) {
            return true;
        }

        return false;
    }
}