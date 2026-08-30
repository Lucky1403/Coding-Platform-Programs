/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        postOrderTraversal(root, ans);
        return ans;
    }
    
    public void postOrderTraversal(Node root, ArrayList<Integer> ans)
    {
        if(root == null)
            return;
        postOrderTraversal(root.left, ans);
        postOrderTraversal(root.right, ans);
        ans.add(root.data);
    }
}