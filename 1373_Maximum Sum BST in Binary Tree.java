class Quad{
    int min;
    int max;
    int sum;
    boolean isBST;

    Quad(int max, int min, int sum, boolean isBST)
    {
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.isBST = isBST;
    }
}

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
    static int MaxSum;
    public int maxSumBST(TreeNode root) {
        MaxSum = 0;
        Helper(root);
        return MaxSum;
    }

    public Quad Helper(TreeNode root)
    {
        if(root == null)
            return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);

        Quad leftSubTree = Helper(root.left);
        Quad rightSubTree = Helper(root.right);
        int max = Math.max(root.val, Math.max(leftSubTree.max, rightSubTree.max));
        int min = Math.min(root.val, Math.min(leftSubTree.min, rightSubTree.min));
        int sum = root.val + leftSubTree.sum + rightSubTree.sum;
        boolean isBST = leftSubTree.isBST && rightSubTree.isBST && (root.val > leftSubTree.max && rightSubTree.min > root.val);

        if(isBST)
            MaxSum = Math.max(sum, MaxSum);

        return new Quad(max, min, sum, isBST);
    }

}