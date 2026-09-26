/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

import java.util.ArrayList;

class Solution {
    public int kthSmallest(Node root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        if(k > list.size())
            return -1;
        return list.get(k-1);
    }
    
    public void inOrder(Node root, ArrayList<Integer> list)
    {
        if(root == null)
            return;
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
}