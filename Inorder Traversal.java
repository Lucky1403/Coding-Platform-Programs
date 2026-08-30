import java.util.ArrayList;

class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inOrderTraversal(root, ans);
        return ans;
    }
    
    public void inOrderTraversal(Node root, ArrayList<Integer> ans)
    {
        if(root == null)
            return;
        inOrderTraversal(root.left, ans);
        ans.add(root.data);
        inOrderTraversal(root.right, ans);
    }
}