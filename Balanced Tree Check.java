/* Structure of binary tree node
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    public boolean isBalanced(Node root) {
        if(root == null)
            return true;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        if(Math.abs(leftLevels - rightLevels) > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int levels(Node root)
    {
        if(root == null)
            return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
}