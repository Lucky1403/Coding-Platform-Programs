import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        view(root, 0, result);
        return result;
    }
    
    public void view(Node root, int level, ArrayList<Integer> result)
    {
        if(root == null)
            return;
        
        if(level == result.size())
            result.add(root.data);
        
        view(root.left, level + 1, result);
        view(root.right, level + 1, result);
    }
}