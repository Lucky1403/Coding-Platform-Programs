/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        view(root, 0, result);
        return result;
    }
    
    private void view (Node root, int level, ArrayList<Integer> result)
    {
        if(root == null)
            return;
            
        if(level >= result.size())
            result.add(root.data);
        else
            result.set(level,root.data);
        view(root.left, level + 1, result);
        view(root.right, level + 1, result);
    }
}