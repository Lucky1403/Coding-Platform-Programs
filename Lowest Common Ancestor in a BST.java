/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public Node findLCA(Node root, Node n1, Node n2) {
        if(root.data > n1.data && root.data > n2.data)
            return findLCA(root.left, n1, n2);
        else if(root.data < n1.data && root.data < n2.data)
            return findLCA(root.right, n1, n2);
        else
            return root;
    }
}