import java.util.ArrayList;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
} 

class Solution {
    public void revInOrder(Node root, ArrayList<Node> list)
    {
        if(root == null)
            return;
        revInOrder(root.right, list);
        list.add(root);
        revInOrder(root.left, list);
    }
    public void transformTree(Node root) {
        ArrayList<Node> list = new ArrayList<>();
        revInOrder(root, list);
        int sum = 0;
        for(int i = 0; i < list.size(); i++)
        {
            int val = list.get(i).data;
            list.get(i).data = sum;
            sum += val;
        }
    }
}