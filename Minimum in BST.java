class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {
    public int minValue(Node root) {
        if(root == null)
            return -1;
        Node temp = root;
        while(temp.left != null)
        {
            temp = temp.left;
        }
        
        return temp.data;
    }
}