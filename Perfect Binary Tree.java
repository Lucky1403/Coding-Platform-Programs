/*Node structure
class Node {
    public int data;
    public Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    boolean isPerfect(Node root) {
        if(root == null)
            return true;
        int totalPossibleNodes = (int) Math.pow(2,levels(root)) - 1;
        if(size(root) == totalPossibleNodes)
            return true;
        else
            return false;
    }
    
    public int size(Node root)
    {
        if(root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }
    
    public int levels(Node root)
    {
        if(root == null)
            return 0;
        return 1 + Math.max(levels(root.left) ,levels(root.right));
    }
};