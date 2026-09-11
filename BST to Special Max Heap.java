import java.util.ArrayList;

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
    static int idx;
    
    public static void inorder(Node root, ArrayList<Integer> list)
    {
        if(root == null)
            return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    
    public static void postOrder(Node root, ArrayList<Integer> list)
    {
        if(root==null)
            return;
        postOrder(root.left, list);
        postOrder(root.right, list);
        root.data = list.get(idx++);
    }
    
    public static void convertToMaxHeap(Node root) {
        idx = 0;
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        postOrder(root, list);
    }
}