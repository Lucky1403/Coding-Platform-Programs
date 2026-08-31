class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Solution {
    boolean hasPathSum(Node root, int target) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null)
        {
            if(root.data == target)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
        return hasPathSum(root.left, target - root.data) || hasPathSum(root.right, target - root.data);
    }
}